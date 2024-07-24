package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 전체 검색
    public ArrayList<BoardDto> getAllBoards() {
        ArrayList<Board> list = (ArrayList<Board>) boardRepository.findAll();
        ArrayList<BoardDto> dtoList = new ArrayList<>();
        for (Board entity:list) {
            dtoList.add(new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getDate()));
        }
        return dtoList;
    }

    // 공지사항 게시글 번호로 찾기
    public Optional<BoardDto> getBoardById(Long id) {
        Optional<Board> entity = boardRepository.findById(id);
        if (entity.isPresent()) {
            Board board = entity.get();
            BoardDto dto = new BoardDto(board.getBoardnum(), board.getTitle(), board.getContent(), board.getDate());
            return Optional.of(dto);
        } else {
            return Optional.empty();
        }
    }

    // 저장 및 수정
    public BoardDto saveBoard(BoardDto dto) {
        Board entity = boardRepository.save(new Board(dto.getBoardnum(), dto.getTitle(), dto.getContent(), dto.getDate()));
        return new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getDate());
    }

    // 삭제
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }

}
