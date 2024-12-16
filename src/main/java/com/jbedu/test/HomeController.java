package com.jbedu.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller 
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/team/rank", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {  
	
		return "index";  // jsp 파일명
	}
	
	@RequestMapping(value = "/readme", method = RequestMethod.GET)
	public String readme() {  
	
		return "readme";  // jsp 파일명
	}
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {  
	
		return "hello";  // jsp 파일명
	}
	
	
	
//   RequestMapping -> 자동완성 사용
//   임포트
//   import org.springframework.web.bind.annotation.RequestMapping;
//   import org.springframework.web.bind.annotation.RequestMethod;
	
	
//	 public String hello(매개변수) {
//	 접근지정자  타입  밸류이름과 같음
//	}
}
