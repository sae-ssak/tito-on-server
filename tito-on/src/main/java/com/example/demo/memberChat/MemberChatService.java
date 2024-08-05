package com.example.demo.memberChat;

import com.example.demo.member.MemberDto;
import com.example.demo.memberAdvice.MemberAdviceDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberChatService {

    private final MemberChatRepository memberChatRepository;

    public MemberChatService(MemberChatRepository memberChatRepository) {
        this.memberChatRepository = memberChatRepository;
    }


    // 회원 이메일로 조회
    public List<MemberChatDto> getChatByEmail(String email) {
        return memberChatRepository.findByEmail_Email(email).stream()
                .map(entity -> new MemberChatDto(entity.getChatnum(), entity.getEmail(), entity.getChat(), entity.getSavedate()))
                .collect(Collectors.toList());
    }


    // 챗 넘버(id)로 조회
    public List<MemberChatDto> getChatById(Long id) {
        return memberChatRepository.findById(id).stream()
                .map(entity -> new MemberChatDto(entity.getChatnum(), entity.getEmail(), entity.getChat(), entity.getSavedate()))
                .collect(Collectors.toList());
    }


    // 저장
    public MemberChatDto saveMemberChat(MemberChatDto dto) {
        MemberChat entity = new MemberChat(dto.getChatnum(), dto.getEmail(), dto.getChat(), dto.getSavedate());
        entity = memberChatRepository.save(entity);
        return new MemberChatDto(entity.getChatnum(), entity.getEmail(), entity.getChat(), entity.getSavedate());
    }

    // 삭제
    public void deleteMemberChat(Long id) {
        memberChatRepository.deleteById(id);
    }
}
