package com.hs.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("home", "home");
		mv.setViewName("/home");
		return mv;
	}
}
