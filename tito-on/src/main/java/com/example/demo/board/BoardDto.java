package com.example.demo.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int boardnum;
    private String title;
    private String content;
    private Date savedate;
}
