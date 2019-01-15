package com.codeup.springproject;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
//    The class should have private properties and getters and setters for a title and body.
    @Column(nullable = false, length = 100)
    private String title;
    @Column(nullable = false)
    private String body;
    @Id @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    public Post(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Post(String title, String body, long id){
        this.title = title;
        this.body = body;
        this.id = id;
    }
    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
