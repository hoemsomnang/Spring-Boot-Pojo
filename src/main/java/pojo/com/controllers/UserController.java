package pojo.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.com.models.User;
import pojo.com.servies.UserService;
@Component
@Controller
public class UserController {

	

	@Autowired
	private UserService userService;
	
	@GetMapping("/users/all")
	public String getAll(Model model) {
		List<User> users=userService.getAll();
		
		model.addAttribute("users",users);
		
		return "index";
		
	}
	@GetMapping("/users/one/")
	public String getAll(int userId, Model model) {
		User user=userService.getOne(userId);
		
		model.addAttribute("user",user);
		return "view-user";
		
	}
	
}
