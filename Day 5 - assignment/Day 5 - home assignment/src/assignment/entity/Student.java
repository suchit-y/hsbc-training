package assignment.entity;

import java.io.Serializable;

public class Student implements Serializable {
	private int stdId;
	private String stdName;
	private int standard;
	private char section;

	public Student() {
	}

	public Student(int stdId, String stdName, int standard, char section) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.standard = standard;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Id: " + stdId + " Name: " + stdName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

}
