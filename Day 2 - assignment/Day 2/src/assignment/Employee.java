package assignment;

public class Employee {
	int empId;
	String empName;
	int basicSalary;
	int allowances;
	MyCalculator mc = new MyCalculator();
	IncomeTaxDeductions itd = new IncomeTaxDeductions();

	Employee(int empId, String empName, int basicSalary, int allowances) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.allowances = allowances;
	}

	// net salary = basic salary + allowances - IT
	public double getNetSalary() {
		return mc.subtract(this.getGrossSalary(), itd.getIT(this.getGrossSalary()));
	}

	public double getGrossSalary() {
		return mc.add(basicSalary, allowances);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(80,"Suchit",45000,5000);
		System.out.println(emp.getGrossSalary());
		System.out.println(emp.getNetSalary());
	}

}
