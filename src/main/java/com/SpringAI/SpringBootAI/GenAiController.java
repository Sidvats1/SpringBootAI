package com.SpringAI.SpringBootAI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAiController {

    @Autowired
    ChatService chatService;

    public GenAiController(ChatService chatService){
        this.chatService=chatService;
    }

    @GetMapping("ask-ai")
    public String getResponse(@RequestParam String prompt){
        return chatService.getResponse(prompt);
    }
}
