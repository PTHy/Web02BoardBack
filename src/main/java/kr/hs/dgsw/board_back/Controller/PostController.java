package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    /*
        Board API
     */

    @GetMapping(value = "/api/boards")
    public List posts() {
        return this.postService.findAll();
    }

    @GetMapping(value = "/api/boards/{id}")
    public Post post(@PathVariable Long id) { return this.postService.findById(id); }

    @GetMapping(value = "/api/users/{userId}/boards")
    public List<Post> postsByUserId(@PathVariable("userId") Long userId) { return this.postService.findByUserId(userId); }

    @PostMapping(value = "/api/boards")
    public Long addPost(@RequestBody Post post) {
        return this.postService.add(post);
    }

    @PutMapping(value = "/api/boards")
    public int modifyPost(@RequestBody Post post) { return this.postService.modify(post); }

    @DeleteMapping(value = "/api/boards/{id}")
    public int deletePost(@PathVariable("id") Long id) { return this.postService.deleteById(id); }
}
