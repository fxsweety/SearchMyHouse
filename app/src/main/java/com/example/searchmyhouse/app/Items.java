package com.example.searchmyhouse.app;

/**
 * Created by sweety on 8/10/14.
 */
public class Items {

    private String text;

    Items(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    private void setText(String text){
        this.text = text;
    }
}
