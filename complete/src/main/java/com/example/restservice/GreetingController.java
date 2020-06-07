package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/ana-risk")
	public AnalysisResult analyse(@RequestParam(value = "token", required = true) String token){

		String validToken = "GVT2020VALID";
		if(!token.equals(validToken)){
			return {}
		}

		float riskLevel = 0.0f;
		String result = AnalysisResult.Result.ACCEPT.toString();
		return new AnalysisResult(riskLevel, result);
	}

}
