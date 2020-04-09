package com.anujsingh.retrofitapk;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    private int id;

    private String title;


    @SerializedName("body")   //use for gson taking body of json
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
}

}
