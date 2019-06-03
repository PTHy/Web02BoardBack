package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int deleteById(Long id);
    Long add(User user);
    int modify(User user);
    User findById(Long id);
}
