package com.example.demo.memberAdvice;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberAdviceRepository extends JpaRepository<MemberAdvice, MemberAdviceId> {

    // email 로 검색
    List<MemberAdvice> findByEmail_Email(String email);

    // email + advnum 으로 검색
    Optional<MemberAdvice> findByEmail_EmailAndAdvnum_Advnum(String email, int advnum);

    // email + advnum 으로 삭제
    @Transactional
    @Modifying
    @Query("delete from MemberAdvice ma where ma.email.email = :email and ma.advnum.advnum = :advnum")
    void deleteByEmailAndAdvnum(String email, int advnum);

}
