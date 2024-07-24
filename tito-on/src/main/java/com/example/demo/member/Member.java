package com.example.demo.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Member {

	@Id
	private String userNum;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String pwd;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String phone;

	@Column(nullable = false)
	private int snsType; // 가입된 계정 타입 (0 : 기본 이메일 가입 / 1: 카카오톡 / 2: 네이버)

	@Column(nullable = false)
	private int isSimpleLogin; // 간편 로그인 허용 여부 (0 : 간편 로그인 허용 / 1: 간편 로그인 미허용)
}