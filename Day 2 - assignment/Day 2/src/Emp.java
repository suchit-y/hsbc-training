
public class Emp {
	private int empId;
	private String empName;
	
	Emp(){
		this.empId = 0;
		this.empName = "null";
	}
	
	Emp(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	void setEmpId(int empId) {
		this.empId = empId;
	}
	
	void setEmpName(String empName) {
		this.empName = empName;
	}
	int getEmpId() {
		return this.empId;
	}
	
	String getEmpName() {
		return this.empName;
	}
}
