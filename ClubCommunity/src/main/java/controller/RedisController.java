package controller;

import domain.Board;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BoardService;
import service.RedisService;

import java.util.List;

@Controller(value = "/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<String> getRedis(String key) {
        return new ResponseEntity<String>(redisService.getStr(key), HttpStatus.OK);
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public ResponseEntity<String> setRedis(String key, String value) {
        return new ResponseEntity<String>(redisService.setStr(key, value), HttpStatus.OK);
    }

}