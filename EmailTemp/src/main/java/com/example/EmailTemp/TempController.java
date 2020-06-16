package com.example.EmailTemp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;


@Controller
public class TempController {

	 @Value("${welcome.message}")
	    private String message;

	    private List<String> tasks = Arrays.asList("Formal", "Request", "Friendly", "Newsletter", "e", "f", "g");

	    @GetMapping("/")
	    public String main(Model model) {
	        model.addAttribute("message", message);
	        model.addAttribute("tasks", tasks);

	        return "welcome"; //view
	    }

	    
	    @GetMapping("/hello")
	    public String mainWithParam(
	            @RequestParam(name = "name", required = false, defaultValue = "")
				String name, Model model) {

	        model.addAttribute("message", name);

	        return "welcome"; //view
	    }

	    @GetMapping("/formal")
	    public String mainWithParamFormal() {

	        return "formal"; //view
	    }
	    
	    @GetMapping("/request")
	    public String mainWithParamRequest() {

	        return "request"; //view
	    }

	    @GetMapping("/news")
	    public String mainWithParamNews() {

	        return "news"; //view
	    }
	    
	    @GetMapping("/friendly")
	    public String mainWithParamFriendly() {

	        return "friendly"; //view
	    }


	
}
