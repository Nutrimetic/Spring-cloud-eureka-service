package Nutrimetic.POC.Springcloudeurekaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	
	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping
	@ResponseBody
	public String message() {
		return "Hello from " + instance;
	}

}
