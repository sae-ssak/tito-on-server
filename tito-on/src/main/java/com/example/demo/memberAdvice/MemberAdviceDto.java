package com.example.demo.memberAdvice;

import com.example.demo.advice.Advice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberAdviceDto {
    private String usernum;
    private int advnum;
    private String savetime;
}
