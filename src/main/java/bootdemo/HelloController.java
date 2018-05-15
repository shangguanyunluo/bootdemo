package bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootdemo.entity.People;

@RestController
public class HelloController {
	
	@Value(value="${name}")
	private String name;
	@Value(value="${message}")
	private String message;
	
	@Autowired
	private People people;
	
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("--------hello----------");
		return "Hello world.";
	}
	@RequestMapping("/")
	public String index(){
		return "Hello index page.";
	}
	
	@RequestMapping("/name")
	public String name(){
		return name;
	}
	@RequestMapping("/message")
	public String message(){
		return message;
	}
	@RequestMapping("/people")
	public People people(){
		return people;
	}

}
