package com.codeup.springproject;

public class Post {
//    The class should have private properties and getters and setters for a title and body.
    private String title;
    private String body;
    private int id;

    public Post(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Post(String title, String body, int id){
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
}
