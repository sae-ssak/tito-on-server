package com.example.demo.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 전체 검색
//    public ArrayList<BoardDto> getAllBoards() {
//        ArrayList<Board> list = (ArrayList<Board>) boardRepository.findAll();
//        ArrayList<BoardDto> dtoList = new ArrayList<>();
//        for (Board entity:list) {
//            dtoList.add(new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getSavedate()));
//        }
//        return dtoList;
//    }

    public List<BoardDto> getAllBoards() {
        return boardRepository.findAll().stream()
                .map(entity -> new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getSavedate()))
                .collect(Collectors.toList());
    }

    // 공지사항 게시글 번호로 찾기
//    public Optional<BoardDto> getBoardById(int id) {
//        Optional<Board> entity = boardRepository.findById(id);
//        if (entity.isPresent()) {
//            Board board = entity.get();
//            BoardDto dto = new BoardDto(board.getBoardnum(), board.getTitle(), board.getContent(), board.getSavedate());
//            return Optional.of(dto);
//        } else {
//            return Optional.empty();
//        }
//    }

    public BoardDto getBoardById(int id) {
        return boardRepository.findById(id)
                .map(entity -> new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getSavedate()))
                .orElseThrow(() -> new RuntimeException("Board not found with id " + id)); // 예외 처리
    }

    // 저장 및 수정
    public BoardDto saveBoard(BoardDto dto) {
        Board entity = new Board(dto.getBoardnum(), dto.getTitle(), dto.getContent(), dto.getSavedate());
        entity = boardRepository.save(entity);
        return new BoardDto(entity.getBoardnum(), entity.getTitle(), entity.getContent(), entity.getSavedate());
    }

    // 삭제
    public void deleteBoard(int id) {
        boardRepository.deleteById(id);
    }

}
