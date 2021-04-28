package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installments;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			Date dueDate = addMonth(contract.getDate(), i);
			contract.getInstallments().add(new Installments(dueDate, fullQuota));
		}
	}
	private Date addMonth(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.MONTH, N);
		return calendar.getTime();
	}
}
