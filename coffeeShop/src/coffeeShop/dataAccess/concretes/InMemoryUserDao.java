package coffeeShop.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.UserDao;
import coffeeShop.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Sisteme baþarýlý þekilde eklendi: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Sistemden baþarýlý bir þekilde silindi! "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate=users.get(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setNationalityId(user.getNationalityId());
		userToUpdate.setDate(user.getDate());
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
