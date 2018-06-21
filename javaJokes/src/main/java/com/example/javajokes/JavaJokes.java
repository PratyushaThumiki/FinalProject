package com.example.javajokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JavaJokes {
    List<String> jokes = asList("1st","2nd","3rd");
    public String getJoke(){
        int random = new Random().nextInt(2);
        return jokes.get(random);
    }
}
