package com.mainapp.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	private ChatClient chatClient;

	public MyService(ChatClient.Builder builder) {
		super();
		this.chatClient = builder.build();
	}
	
	public String getResponseFromAi(String msg) {
		return chatClient.prompt(msg).call().content();
	}
	
	

}
