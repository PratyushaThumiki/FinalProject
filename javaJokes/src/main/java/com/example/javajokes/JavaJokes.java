package com.example.javajokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JavaJokes {
    List<String> jokes = Arrays.asList("Why did the mermaid wear seashells?<p> <b>Because the B-shells were too small and the D-shells were too big!</b>",
                                       "Why do seagulls live by the sea?<p> <b>Because if they lived by the bay, they'd be called bagels!</b>",
                                       "Have you heard the joke about pizza?<p> <b>Never mind, it's too cheesy!</b>");
    public String getJoke(){
        int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
}
