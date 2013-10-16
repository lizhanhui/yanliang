package tv.yanliang.mapper;

import org.springframework.stereotype.Component;
import tv.yanliang.domain.User;

import java.util.List;
import java.util.Map;

@Component("userMapper")
public interface UserMapper {

    public User get(long id);

    public List<User> getAll(Map<String, Integer> map);

}
