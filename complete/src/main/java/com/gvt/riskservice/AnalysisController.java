package com.gvt.riskservice;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnalysisController {

	private static final Logger logger =  LoggerFactory.getLogger(AnalysisController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping(value = "/ana-risk",  consumes= MediaType.APPLICATION_JSON_VALUE)
	public AnalysisResult analyze(@RequestBody InputInfo inputInfo) {

		String expectedToken = inputInfo.getToken();
		if(expectedToken == null || !expectedToken.equals(ValidTokens.VALID_Token)){
			String resultCode = "201";
			logger.info("FAILED -- {}", resultCode);
			return new AnalysisResult(resultCode);
		}

		float riskLevel = 0.0f;
		String result = AnalysisResult.Result.ACCEPT.toString();
		logger.info("SUCCESS -- {} -- {}", riskLevel, result);
		return new AnalysisResult("200",riskLevel, result);
	}

}
