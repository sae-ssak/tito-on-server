package com.example.demo.memberAdvice;

import com.example.demo.advice.Advice;
import com.example.demo.member.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberAdviceDto {
    private Member email;
    private Advice advnum;
    private Date savedate;

}
