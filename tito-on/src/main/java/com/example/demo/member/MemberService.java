package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;

	// 회원 정보 수정
	public MemberDto edit(MemberDto dto) {
		Member entity = dao.findById(dto.getEmail()).orElse(null);
		if (entity != null) {
			entity.setEmail(dto.getEmail());
			entity.setPwd(dto.getPwd());
			entity.setName(dto.getName());
			entity.setPhone(dto.getPhone());
			entity.setSnsType(dto.getSnsType());
			entity.setIsSimpleLogin(dto.getIsSimpleLogin());
			entity = dao.save(entity);
			return new MemberDto(entity.getEmail(), entity.getPwd(), entity.getName(), entity.getPhone(),
					entity.getSnsType(), entity.getIsSimpleLogin());
		}
		return null;
	}

	// 회원 가입
	public Boolean save(MemberDto dto) {

		Member entity = new Member(dto.getEmail(), dto.getPwd(), dto.getName(), dto.getPhone(), dto.getSnsType(),
				dto.getIsSimpleLogin());
		entity = dao.save(entity);
		if (entity != null) {
			return true;
		} else {
			return false;
		}
	}

	// 회원 정보 조회
	public MemberDto getMember(String Email) {
		Member entity = dao.findById(Email).orElse(null);
		if (entity != null) {
			return new MemberDto(entity.getEmail(), entity.getPwd(), entity.getName(), entity.getPhone(),
					entity.getSnsType(), entity.getIsSimpleLogin());
		}
		return null;
	}

	// 회원 탈퇴
	public Boolean delMember(String Email) {
		dao.deleteById(Email);
		Member entity = dao.findById(Email).orElse(null);
		if (entity != null) { 
			return false;
		} else {
			return true; 
		}
	}
}
