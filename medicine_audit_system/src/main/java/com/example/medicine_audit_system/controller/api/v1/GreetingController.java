package com.example.medicine_audit_system.controller.api.v1;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.medicine_audit_system.response.Greeting;
import com.example.medicine_audit_system.response.TestuserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.medicine_audit_system.service.TestuserService;
import com.example.medicine_audit_system.logics.TestuserLogic;
import com.example.medicine_audit_system.record.FullNameRecord;
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
		return new Greeting(counter.incrementAndGet(), String.format(template, name),"makoto");
	}

	@Autowired
	TestuserLogic testuserLogic;
	@GetMapping("/greeting/testuser/getfullname")
	public String getuserfullname(@RequestParam(value = "user_id") Integer user_id){
		FullNameRecord user_fulll_name = testuserLogic.get_test_user_full_name(user_id);

		return new TestuserResponse(user_fulll_name).getResponse();
	}
}
