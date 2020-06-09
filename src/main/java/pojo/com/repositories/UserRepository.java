package pojo.com.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pojo.com.models.User;

@Repository
public class UserRepository {

    List<User> userList=new ArrayList<>();
	{
		userList.add(new User(1,"Somnang", "Male"));
		userList.add(new User(2,"Dalin", "Male"));
		userList.add(new User(3,"Seha", "Male"));
	}
	public List<User> getAll(){
		return this.userList;
	}
	
	public User getOne(int id) {
		for(User u:
			userList) {
			int userId=u.getId();
			if(userId == id) {
				return u;
			}
		}
		return null;
	}
}
