package homeWork2;

public class Student extends User {
	int �d;
	String studentNumber;
	
	public Student() {
		
	}

	public Student(int id, String studentNumber) {
		this();
		�d = id;
		this.studentNumber = studentNumber;
	}

	public int getId() {
		return �d;
	}

	public void setId(int id) {
		�d = id;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
