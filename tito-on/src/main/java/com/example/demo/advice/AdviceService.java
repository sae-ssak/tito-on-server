package com.example.demo.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdviceService {
    @Autowired
    private AdviceRepository adviceRepository;

    public Optional<Advice> getAdviceById(Long id) {
        return adviceRepository.findById(id);
    }

    // 조언 랜덤으로 하나 -- 기분을 고르면!
}
