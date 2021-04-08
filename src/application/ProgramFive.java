package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramFive {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		// Quantos funcionários serão registrados?
		System.out.print("How many employees will be registered ?: ");
		int n = e.nextInt();

		List<Employee> employee = new ArrayList<>();

		System.out.println();
		for (int i = 0; i < n; i++) {
			e.nextLine();
			System.out.println("Employee #: " + (i + 1));
			System.out.print("Id: ");
			Integer id = e.nextInt();
/*
			while (hasId(employee, id)) {
				System.out.print("Existing code, try again ...");
				id = e.nextInt();
			}
*/
			e.nextLine();
			System.out.print("Name: ");
			String name = e.nextLine();
			System.out.print("Salary: ");
			double salary = e.nextDouble();

			System.out.println();
			employee.add(new Employee(id, name, salary));
		}

		// Digite a identificação do funcionário que terá aumento de salário:
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = e.nextInt();

		Integer emp = findId(employee, idSalary);

		if (emp == null) {
			System.out.print("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = e.nextDouble();
			employee.get(emp).addIncrease(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId() + ", " + employee2.getName() + ", " + employee2.getSalary());
		}
		e.close();
	}

	public static Integer findId(List<Employee> employee, int id) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
/*
	public static boolean hasId(List<Employee> employee, int id) {
		Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}*/

}
