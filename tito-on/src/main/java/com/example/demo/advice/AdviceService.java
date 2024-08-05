package com.example.demo.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdviceService {
    private final AdviceRepository adviceRepository;

    public AdviceService(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    // (유저가 저장한 advice 를 불러올 때) .. ..? 쓸 일이 있나?
    public AdviceDto getAdviceById(int advnum) {
        return adviceRepository.findById(advnum)
                .map(entity -> new AdviceDto(entity.getAdvnum(), entity.getAdvice(), entity.getEmotion()))
                .orElseThrow(() -> new RuntimeException("Advice not found with id " + advnum));
    }

    // 조언 랜덤으로 하나 -- 기분을 고르면!
    public AdviceDto getAdviceRandomly(int emotion) {
        return adviceRepository.findByAdviceRandomly(emotion)
                .map(entity -> new AdviceDto(entity.getAdvnum(), entity.getAdvice(), entity.getEmotion()))
                .orElseThrow(() -> new RuntimeException("Advice not found with emotion " + emotion));
    }
}
