package com.example.javajokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JavaJokes {
    List<String> jokes = Arrays.asList("1st","2nd","3rd");
    public String getJoke(){
        int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
}
