package com.example.demo_chat_module.chat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    
    private MessageType type;
    private String content;
    private String sender;
    
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
    
}
