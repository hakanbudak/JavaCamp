package homeWork2;

public class Student extends User {
	int ıd;
	String studentNumber;
	
	public Student() {
		
	}

	public Student(int id, String studentNumber) {
		this();
		ıd = id;
		this.studentNumber = studentNumber;
	}

	public int getId() {
		return ıd;
	}

	public void setId(int id) {
		ıd = id;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
