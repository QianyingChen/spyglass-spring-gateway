package com.skillstorm.financialGoalPlanner.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/cache/goals")
	public String cashedGoals() {
		return "Cached Goals";
	} 
	//will change later
}
