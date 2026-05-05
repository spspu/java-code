package com.mainapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.service.MyService;

@RestController
@RequestMapping("/ai")
public class MyController {
	
	
	private final MyService myService;

	public MyController(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@GetMapping("/ask")
	public ResponseEntity<String> getResponseFromAi(@RequestParam String msg){
		String response = myService.getResponseFromAi(msg);
		return ResponseEntity.ok(response);
	}
	
	
}
