package service;

import domain.Board;

import java.util.List;

public interface RedisService {
    String setStr(String key,String value);
    String getStr(String key);
}
