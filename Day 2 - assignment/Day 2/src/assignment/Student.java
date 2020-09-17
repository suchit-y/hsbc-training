package assignment;

public class Student {
	private String studentName;
	private int studentRollNo, standard;
	private char section;

	Student() {
		this.studentName = "unassigned";
		this.studentRollNo = 0;
		this.standard = 0;
		this.section = '0';
	}

	Student(int studentRollNo, String studentName, int standard, char section) {
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.standard = standard;
		this.section = section;
	}

	public void display() {
		System.out.println("Roll no.: " + studentRollNo);
		System.out.println("Name: " + studentName);
		System.out.println("Standard: " + standard);
		System.out.println("Section: " + section);
	}

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student(80, "Suchit", 12, 'B');
		std1.display();
		std2.display();
	}

}
