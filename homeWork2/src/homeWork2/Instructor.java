package homeWork2;

public class Instructor extends User {
	 int �d;
	 String branch;

	public Instructor() {
		
	}
    public Instructor(int id, String branch) {
			this();
			this.�d = id;
			this.branch = branch;
		}
	public int getId() {
		return �d;
	}
	public void setId(int id) {
		�d = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	 
	
	  
}
