package com.codeup.springproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    // service should keep an array list of posts internally
    List<Post> posts = new ArrayList<>();

    // Constructor
    public PostService(){
    // create a few test posts
        posts = new ArrayList<>();
        posts.add(new Post("Gone With the Wind", "Frankly, my dear, I don't give a damn.", 0));
        posts.add(new Post("The Godfather", "I'm going to make him an offer he can't refuse.", 1));
        posts.add(new Post("Star Wars", "May the force be with you.", 2));
        posts.add(new Post("Taxi Driver", "You talking to me?", 3));
        posts.add(new Post("Jerry Maguire", "Show me the money!", 4));
        posts.add(new Post("The Terminator", "I'll be back", 5));
        posts.add(new Post("Apollo 13", "Houston, we have a problem", 6));
        posts.add(new Post("A League of Their Own", "There's no crying in baseball", 7));
        posts.add(new Post("The Shining", "Here's Johnny!", 8));
        posts.add(new Post("The Sixth Sense", "I see dead people.", 9));
    }

    // method to find one post
    public Post findOne(int id){
        return posts.get(id);
    }

    // method to find all posts
    public List<Post> findAll(){
        return posts;
    }
}
