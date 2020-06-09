package pojo.com.servies;

import java.util.List;


import pojo.com.models.User;


public interface UserService {

  public List<User> getAll();
  public void save(User user);
  public User getOne(int id);
}
