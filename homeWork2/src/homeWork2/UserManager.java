package homeWork2;

public class UserManager {
	public void addToUser(User user) {
		System.out.println("Kullanýcý eklendi "+ user.getName()+" "+user.getLastName());
	}
	//bulk insert
	public void addMultiple(User[] users) {
		for (User user : users) {
			addToUser(user);
		}
	}
	public void add(Logger logger) {
		logger.log();
	}
}
