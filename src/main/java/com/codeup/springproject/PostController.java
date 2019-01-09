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
//  create a new array list
    List<Post> posts = new ArrayList<>();
    // injecting PostService to PostController
    private PostService postService;

//    public PostController(){
//        posts.add(new Post("First Post Title", "First post description"));
//    }

    // NEW CONSTRUCTOR
    public PostController(PostService postService){
        this.postService = postService;
    }


    @GetMapping("/posts")
    public String posts(Model model) {
//      add two post objects to the array list
//        posts.add(new Post("Post Title", "Post Body"));
//        posts.add(new Post("Post Title 2", "Post Body 2"));
//      pass the list to view
//        model.addAttribute("posts", posts);

        model.addAttribute("posts", postService.findAll());



        return "posts/index";

    }


    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model model) {
//        create a new post object and pass to view
        Post post = postService.findOne(id);
        model.addAttribute("post", post);


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
