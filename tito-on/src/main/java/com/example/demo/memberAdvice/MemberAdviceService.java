package com.example.demo.memberAdvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberAdviceService {

    private  final MemberAdviceRepository memberAdviceRepository;

    public MemberAdviceService(MemberAdviceRepository memberAdviceRepository) {
        this.memberAdviceRepository = memberAdviceRepository;
    }


    // 회원 이메일로 조회
    public List<MemberAdviceDto> getAdviceByEmail(String email) {
        return memberAdviceRepository.findByEmail_Email(email).stream()
                .map(entity -> new MemberAdviceDto(entity.getEmail(), entity.getAdvnum(), entity.getSavedate()))
                .collect(Collectors.toList());
    }


    // 회원 이메일 + 조언 번호로 조회
    public List<MemberAdviceDto> getAdviceByEmailAndAdvnum(String email, int advnum) {
        return memberAdviceRepository.findByEmail_EmailAndAdvnum_Advnum(email, advnum).stream()
                .map(entity -> new MemberAdviceDto(entity.getEmail(), entity.getAdvnum(), entity.getSavedate()))
                .collect(Collectors.toList());
    }


    // 저장
    public MemberAdviceDto saveMemberAdvice(MemberAdviceDto dto) {
        MemberAdvice entity = new MemberAdvice(dto.getEmail(), dto.getAdvnum(), dto.getSavedate());
        entity = memberAdviceRepository.save(entity);
        return new MemberAdviceDto(entity.getEmail(), entity.getAdvnum(), entity.getSavedate());
    }


    // 삭제
    public void deleteMemberAdvice(String email, int advnum) {
        memberAdviceRepository.deleteByEmailAndAdvnum(email, advnum);
    }



}
