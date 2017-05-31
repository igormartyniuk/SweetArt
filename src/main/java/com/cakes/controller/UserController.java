package com.cakes.controller;

import com.cakes.validator.user.UserValidationMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cakes.entity.User;
import com.cakes.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// @GetMapping("/registration")
	// public String registration(){
	// return "registration";
	// }

	@GetMapping("/registration")
	public String registration(Model model) {

		model.addAttribute("users", userService.findAll());
		model.addAttribute("user", new User());

		return "registration";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user, Model model) {

		try {
			userService.save(user);
		} catch (Exception e) {
			if (e.getMessage().equals(UserValidationMessages.EMPTY_USER_NAME_FIELD) ||
					e.getMessage().equals(UserValidationMessages.USER_NAME_ALREADY_EXIST)) {
				model.addAttribute("usernameException", e.getMessage());
			} else if (e.getMessage().equals(UserValidationMessages.EMPTY_EMAIL_FIELD) ||
					e.getMessage().equals(UserValidationMessages.EMAIL_ALREADY_EXIST)  ||
					e.getMessage().equals(UserValidationMessages.WRONG_EMAIL)){
				model.addAttribute("emailException", e.getMessage());
			} else if (e.getMessage().equals(UserValidationMessages.EMPTY_PASSWORD_FIELD)||
					e.getMessage().equals(UserValidationMessages.EMPTY_PASSWORD_FIELD)){
				model.addAttribute("passwordException", e.getMessage());

		}
            return "registration";
		}

		return "redirect:/registration";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id){
		
		userService.delete(id);
		
		return "redirect:/registration";
	}
	
	@GetMapping("/updateUser/{id}")
	public String updateUser(@PathVariable int id, Model model){
		
		User user = userService.findOne(id);
		
		model.addAttribute("currentUser", user);
		
		return "updateUser";
	}
	
	@PostMapping("/updateUser/{id}")
	public String updateUser(@PathVariable int id, 
							 @RequestParam String name, 
							 @RequestParam String email,
							 @RequestParam String password) throws Exception {
		
	User user = userService.findOne(id);
	
	user.setName(name);
	user.setEmail(email);
	user.setPassword(password);
	
	userService.save(user);
	
	return "redirect:/registration";
	}
}
