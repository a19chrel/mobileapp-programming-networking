package com.example.networking;

public class Mountain {

    private String id;
    private String name;
    private int size;

    public Mountain(){
        id = "none";
        name = "Name Missing";
        size = 0;
    }

    public Mountain(String id, String name, int size){
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }
}
