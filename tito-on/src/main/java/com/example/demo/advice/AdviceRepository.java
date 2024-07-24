package com.example.demo.advice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceRepository extends JpaRepository<Advice, Long> {
    // 조언 랜덤으로 하나 -- 기분을 고르면!


}
