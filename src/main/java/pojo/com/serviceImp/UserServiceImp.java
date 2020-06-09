package pojo.com.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.com.models.User;
import pojo.com.repositories.UserRepository;
import pojo.com.servies.UserService;
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		// Business Rule
		return this.userRepository.getAll();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getOne(int id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

}
