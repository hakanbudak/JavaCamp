package homeWork2;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setName("hakan");
		user.setLastName("budak");
		user.setEmail("hakanbudk@gmail.com");
		user.setPassword("1234");
		
		Student student=new Student();
		student.setId(1);
		student.setStudentNumber("27");
		student.setName("efe");
		student.setLastName("sayıs");
		student.setEmail("efe@gmail.com");
		student.setPassword("12345");
		
		Instructor ınstructor=new Instructor();
		ınstructor.setId(1);
		ınstructor.setBranch("java script");
		ınstructor.setName("beyza");
		ınstructor.setLastName("yıldırım");
		ınstructor.setEmail("beyza@gmail.com");
		ınstructor.setPassword("123456");
		
		InstructorManager ıns=new InstructorManager();
		ıns.addToInstructor(ınstructor);
		
		User[] users = {user,student,ınstructor};
		
		UserManager usr=new UserManager();
		//usr.addToUser(user);
		usr.addMultiple(users);
		usr.add(new DatabaseLogger());
		
		
		
	}

}
