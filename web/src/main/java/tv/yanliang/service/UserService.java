package tv.yanliang.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tv.yanliang.domain.User;
import tv.yanliang.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User get(long id) {
        return userMapper.get(id);
    }

    public List<User> get(int start, int max) {
        Map<String, Integer> parameterMap = new HashMap<String, Integer>();
        parameterMap.put("start", start);
        parameterMap.put("max", max);
        return userMapper.getAll(parameterMap);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
