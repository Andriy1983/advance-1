package ua.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ua.entity.User;
import ua.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public String homeController() {
		return "homepage";
	}

	@RequestMapping(value = "/registration")
	public String registrationController(Model model) {
		model.addAttribute("registrationForm", new User());
		return "registration";
	}

	@RequestMapping(value = "/registrateUser", method = RequestMethod.POST)
	public String registrateUser(@ModelAttribute(value = "registrationForm") User user,
			RedirectAttributes redirectAttributes) {
		userService.getUser(user.getUsername());
		if (userService.getUser(user.getUsername()) == null) {
			userService.userServiceSaveUser(user);
		} else {
			redirectAttributes.addFlashAttribute("warning", "уже есть такой логин");
			return "redirect:/registration";
		}

		return "redirect:/";
	}
	
	

}
