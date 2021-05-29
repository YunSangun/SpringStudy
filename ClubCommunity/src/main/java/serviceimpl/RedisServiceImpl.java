package serviceimpl;

import domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import repository.BoardMapper;
import service.BoardService;
import service.RedisService;
import util.MyUtil;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RedisServiceImpl implements service.RedisService {

    @Resource(name = "redisTemplate")
    private ValueOperations<String, String> valueOps;

    public String setStr(String key, String value) {
        valueOps.set(key, value);
        return valueOps.get(key);
    }

    public String getStr(String key) {
        String result = valueOps.get(key);
        return result;
    }
}