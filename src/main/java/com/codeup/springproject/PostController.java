package com.codeup.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("post", postService.findOne(id));
        model.addAttribute("id", id);
        return "posts/show";
    }

    // view the form
    @GetMapping("/posts/create")
    public String displayCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    // saving the new post
    @PostMapping("/posts/create")
    public String save(Post post){
        postService.savePost(post);
        return "redirect:/posts";

        //            @RequestParam(name = "title") String title,
//            @RequestParam(name = "body") String body
//    ) {
//        Post post = new Post();
//        post.setTitle(title);
//        post.setBody(body);
//        // save the post
//        return "saving after a new post created";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.findOne(id));
        return "posts/edit";
    }

    // method for editing a post
    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post)
        {
            postService.edit(post);

            return "redirect:/posts/" + post.getId();
        }


}
