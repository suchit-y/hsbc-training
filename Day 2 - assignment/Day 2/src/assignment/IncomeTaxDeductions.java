package assignment;

public class IncomeTaxDeductions {
	double IT;
	MyCalculator mc;

	public double getIT(double grossSalary) {
		if (grossSalary <= 250000)
			return 0;
		else if (grossSalary <= 500000)
			return mc.multiply(grossSalary, 0.05);
		else if (grossSalary <= 750000)
			return mc.multiply(grossSalary, 0.1);
		else if (grossSalary <= 1000000)
			return mc.multiply(grossSalary, 0.15);
		else if (grossSalary <= 1250000)
			return mc.multiply(grossSalary, 0.2);
		else if (grossSalary <= 1500000)
			return mc.multiply(grossSalary, 0.25);
		else
			return mc.multiply(grossSalary, 0.3);
	}
}
