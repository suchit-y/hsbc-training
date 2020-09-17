public class EmpDb {
	int maxLength = 10;
	Emp empList[] = new Emp[maxLength];
	int i = 0;

	public void addEmp(int empId, String empName) {
		if (i == maxLength)
			System.out.println("DB Full");
		empList[i++] = new Emp(empId, empName);
	}

	public void deleteEmp(int empId) {
		int pos = searchEmp(empId);
		for (int j = pos; j < i; ++j) {
			empList[j] = empList[j + 1];
			i--;
		}
	}

	public int searchEmp(int empId) {
		int j = -1, temp = i;
		for (j = 0; j < temp; j++) {
			if (empId == empList[j].getEmpId()) {
				// String empName = employees[j].getEmpName();
				// System.out.println("empId: "+empId+" empName: "+ empName);
				return j;
			}
		}
		return -1;
	}
	
	public void findEmp(int empId) {
		int pos = searchEmp(empId);
		System.out.println(empList[pos].getEmpId() + " " + empList[pos].getEmpName());
	}

	public void displayEmpList() {
		System.out.println("S.No. " + "EmpId" + " " + "EmpName");
		for (int j = 0; j < i; ++j) {
			System.out.println(j + 1 + "    " + empList[j].getEmpId() + "    " + empList[j].getEmpName());
		}
	}

	public static void main(String[] args) {
		EmpDb e = new EmpDb();
		e.addEmp(80, "Suchit");
		e.addEmp(81, "Shantanu");
		e.addEmp(82, "Shashank");
		e.addEmp(83, "Sagar");
		e.findEmp(82);
		e.displayEmpList();
	}
}
