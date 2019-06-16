package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User login(User user) {
        System.out.println(user.toString());
        return userMapper.login(user);
    }

    @Override
    public Long add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return userMapper.modify(user);
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }
}
