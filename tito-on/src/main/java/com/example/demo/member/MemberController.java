package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/members")
public class MemberController {

	@Autowired
	private MemberService service;

	
//CRUD
	
	// 가입하기
	@PostMapping("/join")
	public Boolean join(@RequestBody MemberDto dto) {
		Boolean result = service.save(dto);
		return result;
	}
	
	//탈퇴 
	@DeleteMapping("/{email}")
	public Boolean del(@PathVariable("email") String email) {
		Boolean result =   service.delMember(email);
		return result;
	}
	
	//회원 정보 수정 (비밀번호, 전화번호, 
	
	
	
}
