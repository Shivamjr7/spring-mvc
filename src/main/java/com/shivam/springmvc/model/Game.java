package com.shivam.springmvc.model;


//TODO make this an entity as next step and persist in db
//TODO include lombok to remove getter/setter and make it as a builder
public class Game {
    private String name;
    private long id;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
