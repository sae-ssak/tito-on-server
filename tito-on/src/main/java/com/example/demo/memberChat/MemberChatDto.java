package com.example.demo.memberChat;

import com.example.demo.member.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberChatDto {
    private long chatnum;
    private Member email;
    private String chat;
    private Date savedate;
}
