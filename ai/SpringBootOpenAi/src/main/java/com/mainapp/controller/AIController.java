package com.mainapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.service.OpenAIService;
//http://localhost:8080/api/ai/ask?prompt=Hello
@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final OpenAIService service;

    public AIController(OpenAIService service) {
        this.service = service;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam String prompt) {
        return service.getResponse(prompt);
    }
}