package com.example.demo.advice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdviceRepository extends JpaRepository<Advice, Integer> {

    // 조언 랜덤으로 하나 -- 기분을 고르면!
    @Query(value="select * from (select * from Advice where emotion=:emotion order by DBMS_RANDOM.RANDOM) where rownum <= 1", nativeQuery = true)
    Optional<Advice> findByAdviceRandomly(@Param("emotion") int emotion);


}
