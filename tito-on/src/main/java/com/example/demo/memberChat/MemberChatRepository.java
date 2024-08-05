package com.example.demo.memberChat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberChatRepository extends JpaRepository<MemberChat, Long> {

    // email 로 검색
    List<MemberChat> findByEmail_Email(String email);

}
