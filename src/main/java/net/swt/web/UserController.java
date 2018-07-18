package net.swt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping("/insert") //댓글 작성 
    @ResponseBody
    private String mCommentServiceInsert(@RequestParam String userId, @RequestParam String password) throws Exception{
        
		System.out.println(userId+""+password);
        
        return "process";
    }

}
