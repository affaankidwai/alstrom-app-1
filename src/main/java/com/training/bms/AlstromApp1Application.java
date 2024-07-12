package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlstromApp1Application {
	
	@GetMapping("enjoyWeekend")  
	public String weekend() {
		return "Saturday and Sunday";
	}

	public static void main(String[] args) {
		SpringApplication.run(AlstromApp1Application.class, args);
		System.out.println("Alstrom has been started");
		
		
	}

}
