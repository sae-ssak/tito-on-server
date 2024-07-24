package com.example.demo.faq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FAQDto {
    private int qnum;
    private String question;
    private String answer;
}
