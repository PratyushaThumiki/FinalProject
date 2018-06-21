package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.JavaJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JavaJokes().getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}