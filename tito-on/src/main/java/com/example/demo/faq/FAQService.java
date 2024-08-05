package com.example.demo.faq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FAQService {

    private final FAQRepository faqRepository;

    public FAQService(FAQRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    // 전체검색
    public List<FAQDto> getAllFAQ() {
        return faqRepository.findAll().stream()
                .map(entity -> new FAQDto(entity.getQnum(), entity.getQuestion(), entity.getAnswer()))
                .collect(Collectors.toList());
    }


    // 질문 번호로 찾기
    public FAQDto getFAQById(int id) {
        return faqRepository.findById(id)
                .map(entity -> new FAQDto(entity.getQnum(), entity.getQuestion(), entity.getAnswer()))
                .orElseThrow(() -> new RuntimeException("FAQ not found with id " + id));
    }

    // 저장 및 수정
    public FAQDto saveFAQ(FAQDto dto) {
        FAQ entity = new FAQ(dto.getQnum(), dto.getQuestion(), dto.getAnswer());
        entity = faqRepository.save(entity);
        return new FAQDto(entity.getQnum(), entity.getQuestion(), entity.getAnswer());
    }


    // 삭제
    public void deleteFAQ(int id) { faqRepository.deleteById(id); }
}
