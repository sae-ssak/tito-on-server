package com.example.demo.faq;

import com.example.demo.board.Board;
import com.example.demo.board.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FAQService {

    @Autowired
    private FAQRepository faqRepository;

    // 전체검색
    public ArrayList<FAQDto> getAllFAQ() {
        ArrayList<FAQ> list = (ArrayList<FAQ>) faqRepository.findAll();
        ArrayList<FAQDto> dtoList = new ArrayList<>();
        for (FAQ entity:list) {
            dtoList.add(new FAQDto(entity.getQnum(), entity.getQuestion(), entity.getAnswer()));
        }
        return dtoList;
    }


    // 질문 번호로 찾기
    public Optional<FAQDto> getFAQById(int id) {
        Optional<FAQ> entity = faqRepository.findById(id);
        if (entity.isPresent()) {
            FAQ faq = entity.get();
            FAQDto dto = new FAQDto(faq.getQnum(), faq.getQuestion(), faq.getAnswer());
            return Optional.of(dto);
        } else {
            return Optional.empty();
        }
    }

    // 저장 및 수정
    public FAQDto saveFAQ(FAQDto dto) {
        FAQ entity = faqRepository.save(new FAQ(dto.getQnum(), dto.getQuestion(), dto.getAnswer()));
        return new FAQDto(entity.getQnum(), entity.getQuestion(), entity.getAnswer());
    }


    // 삭제
    public void deleteFAQ(int id) { faqRepository.deleteById(id); }
}
