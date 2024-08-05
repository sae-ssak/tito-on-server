package com.example.demo.memberAdvice;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Date;

import com.example.demo.advice.Advice;
import com.example.demo.member.Member;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DynamicInsert
@IdClass(MemberAdviceId.class)
public class MemberAdvice {

    @Id
    @ManyToOne
    @JoinColumn(name = "email", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Member email;

    @Id
    @ManyToOne
    @JoinColumn(name = "advNum", nullable = false)
    private Advice advnum;

    @Column(name = "saveDate", nullable = false)
    private Date savedate;

}
