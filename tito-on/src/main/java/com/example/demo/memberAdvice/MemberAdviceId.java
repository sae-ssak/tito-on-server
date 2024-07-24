package com.example.demo.memberAdvice;

import com.example.demo.advice.Advice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MemberAdviceId implements Serializable {
    private String usernum;
    private long advNum;
    private String savetime;
}
