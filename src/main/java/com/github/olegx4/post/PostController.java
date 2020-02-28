package com.github.olegx4.post;

import com.github.olegx4.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("topic")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{topicId}/posts")
    public List<Post> getAllPosts(@PathVariable String topicId) {
        return postService.getAllPosts(topicId);
    }

    @PostMapping("/{topicId}/posts")
    public void addPost(@RequestBody Post post, @PathVariable String topicId) {
        post.setTopic(new Topic(topicId, "", ""));
        postService.addPost(post);
    }


}