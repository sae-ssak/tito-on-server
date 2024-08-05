package com.example.demo.advice;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AdviceDto {
    private int advnum;
    private String advice;
    private int emotion;
}
