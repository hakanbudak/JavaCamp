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
		student.setLastName("say�s");
		student.setEmail("efe@gmail.com");
		student.setPassword("12345");
		
		Instructor �nstructor=new Instructor();
		�nstructor.setId(1);
		�nstructor.setBranch("java script");
		�nstructor.setName("beyza");
		�nstructor.setLastName("y�ld�r�m");
		�nstructor.setEmail("beyza@gmail.com");
		�nstructor.setPassword("123456");
		
		InstructorManager �ns=new InstructorManager();
		�ns.addToInstructor(�nstructor);
		
		User[] users = {user,student,�nstructor};
		
		UserManager usr=new UserManager();
		//usr.addToUser(user);
		usr.addMultiple(users);
		usr.add(new DatabaseLogger());
		
		
		
	}

}
