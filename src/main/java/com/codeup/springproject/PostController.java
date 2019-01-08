package com.codeup.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    List<Post> posts = new ArrayList<>();

    public PostController(){
        posts.add(new Post("First Post Title", "First post description"));
    }

    @GetMapping("/posts")
    public String posts(Model model) {

        posts.add(new Post("Post Title", "Post Body"));
        posts.add(new Post("Post Title 2", "Post Body 2"));
        model.addAttribute("posts", posts);
        return "posts/index";

    }


    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model model) {
        model.addAttribute("post", posts.get(id-1));

        return "posts/show";
    }

    @ResponseBody
    @GetMapping("/posts/create")
    public String create() {

        return "viewing the form for creating a post";
    }

    @ResponseBody
    @PostMapping("/posts/create")
    public String save() {

        return "saving after a new post created";
    }
}
