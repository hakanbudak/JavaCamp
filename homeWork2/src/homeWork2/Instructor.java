package homeWork2;

public class Instructor extends User {
	 int ýd;
	 String branch;

	public Instructor() {
		
	}
    public Instructor(int id, String branch) {
			this();
			this.ýd = id;
			this.branch = branch;
		}
	public int getId() {
		return ýd;
	}
	public void setId(int id) {
		ýd = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	 
	
	  
}
