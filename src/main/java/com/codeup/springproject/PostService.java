package com.codeup.springproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    // service should keep an array list of posts internally
//    List<Post> posts = new ArrayList<>();

    private PostRepository postRepository;


    // Constructor
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    // create a few test posts
//        posts = new ArrayList<>();
//        savePost(new Post("Gone With the Wind", "Frankly, my dear, I don't give a damn."));
//        savePost(new Post("The Godfather", "I'm going to make him an offer he can't refuse."));
//        savePost(new Post("Star Wars", "May the force be with you."));
//        savePost(new Post("Taxi Driver", "You talking to me?"));
//        savePost(new Post("Jerry Maguire", "Show me the money!"));
//        savePost(new Post("The Terminator", "I'll be back"));
//        savePost(new Post("Apollo 13", "Houston, we have a problem"));
//        savePost(new Post("A League of Their Own", "There's no crying in baseball"));
//        savePost(new Post("The Shining", "Here's Johnny!"));
//        savePost(new Post("The Sixth Sense", "I see dead people."));
    }

    // method to find one post
    public Post findOne(long id){
        return postRepository.findOne(id);
    }

    // method to find all posts
    public Iterable<Post> findAll(){
        return postRepository.findAll();
    }

    // save method - takes in a Post object, set its id, and adds to the list of posts
    public Post savePost(Post post){
//        post.setId(posts.size() + 1);
//        posts.add(post);
        return postRepository.save(post);
    }
//
    public void delete(long id){
//        Post pp = posts.get(post.getId()-1);
//        pp.setTitle(post.getTitle());
//        pp.setBody(post.getBody());
        postRepository.delete(id);
    }
}
