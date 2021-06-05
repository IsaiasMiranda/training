package entities;

public class Employee {
	private Integer id;
	private String name;
	private String email;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, String email, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void addIncrease(Double percentage) {
		setSalary(getSalary() + (getSalary() * percentage / 100));
	}
}
