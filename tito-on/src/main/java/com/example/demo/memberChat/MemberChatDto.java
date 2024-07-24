package com.example.demo.memberChat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberChatDto {
    private long chatNum;
    private String usernum;
    private String chat;
}
