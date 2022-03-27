package com.example.medicine_audit_system.controller.api.v1;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.medicine_audit_system.response.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.medicine_audit_system.service.TestuserService;
import com.example.medicine_audit_system.model.Testuser;
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class GreetingController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    @Autowired
	TestuserService testuserService;

	@GetMapping("/greeting")
	
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println(testuserService.findAllNameData().get(0).getFullName());
		return new Greeting(counter.incrementAndGet(), String.format(template, name),"mako");
	}


}
