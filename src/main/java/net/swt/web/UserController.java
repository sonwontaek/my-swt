package net.swt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<user> users = new ArrayList<user>();
	
	@PostMapping("/create")
//	public String create(String userId, String password, String name, String email) {
	public String create(user user) {
		System.out.println("userid:"+user);
		users.add(user);
//		return "index";
		return "redirect:/list";
	}
	@PostMapping("/login")
//	public String create(String userId, String password, String name, String email) {
	public String login(user user,Model model) {
		System.out.println("user:"+user);
//		model.addAttribute("userid",userid);
//		model.addAttribute("age",age);
		model.addAttribute("user",user);
		return "process";
//		return "redirect:/list";
	}
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		
		return "list";
		
	}
	@GetMapping("/index")
	public String index(Model model) {
	
		
		return "index";
		
	}
	@GetMapping("/login")
	public String login(Model model) {
	
		
		return "login";
		
	}
}
