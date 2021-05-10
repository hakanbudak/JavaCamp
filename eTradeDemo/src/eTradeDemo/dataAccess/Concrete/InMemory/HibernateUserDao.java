package eTradeDemo.dataAccess.Concrete.InMemory;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.Entities.Concrete.User;
import eTradeDemo.dataAccess.Abstract.UserDao;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý sisteme kayýt oldu : "+user.getFirstName());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("Silme iþlemi baþarýlý " + user.getId()+" | "+user.getFirstName());
		users.removeIf(usr -> usr.getId()==user.getId());
		
	}

	@Override
	public void update(User user) {
		User usersToUpdate=users.get(user.getId());
		usersToUpdate.setFirstName(user.getFirstName());
		usersToUpdate.setLastName(user.getLastName());
		usersToUpdate.setEmail(user.getEmail());
		usersToUpdate.setPassword(user.getPassword());
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}
	

	@Override
	public User getByLoginInfo(String email, String password) {
		for (User user : users) {
			if(user.getEmail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean getByEmail(User user) {
		for (User person : users) {
			if(person.getEmail()== user.getEmail()) {
				return false;
			}
		}
		return true;
	}


}
