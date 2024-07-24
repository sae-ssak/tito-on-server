package com.example.demo.springAi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ChatController {
	
	private final OpenAiChatModel chatModel; 
	
	

	public ChatController(OpenAiChatModel chatModel) {
		this.chatModel = chatModel; 
	}
	
	@GetMapping("/chat")
	public Map <String ,String> chatResponse(@RequestParam String message) {
		Map <String, String> responses = new HashMap<>(); 
		
		String openAiResponse = chatModel.call(message); 
		responses.put("대답", openAiResponse);
		return responses; 		
	}


}
