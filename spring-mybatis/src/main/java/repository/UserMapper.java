package repository;

import domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from users")
    public List<User> getUsers();
}
