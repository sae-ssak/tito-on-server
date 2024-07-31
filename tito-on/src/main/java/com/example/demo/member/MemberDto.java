package com.example.demo.member;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {



	private String email;
	private String pwd;
	private String name;
	private String phone;
	private int snsType; 
	private int isSimpleLogin; 
	


}