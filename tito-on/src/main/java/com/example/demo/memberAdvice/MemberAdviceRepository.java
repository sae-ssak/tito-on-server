package com.example.demo.memberAdvice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberAdviceRepository extends JpaRepository<MemberAdvice, MemberAdviceId> {

}
