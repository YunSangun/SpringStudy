package serviceimpl;

import domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BoardMapper;
import service.BoardService;
import util.MyUtil;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<Board> getBoards() {
        return boardMapper.getBoards(MyUtil.getUserId());
    }
}
