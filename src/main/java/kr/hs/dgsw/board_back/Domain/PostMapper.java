package kr.hs.dgsw.board_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    int deleteById(@Param("id") Long id);
    List<Post> findByUserId(@Param("userId") Long userId);
    Long add(Post post);
    int modify(Post post);
    Post findById(@Param("id") Long id);
    int addWithHashMap(HashMap<String, Object> map);
}
