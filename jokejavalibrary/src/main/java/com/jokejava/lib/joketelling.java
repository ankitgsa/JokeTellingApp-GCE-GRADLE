package com.jokejava.lib;

import java.util.Random;

/**
 * Created by Ankit on 29-01-2017.
 */

public class joketelling {
    String joke[] = {
            "Why does Snoop Dogg carry an umbrella? For drizzle!",
            "Gasoline is so overpriced right now, ExxonMobil just changed the names of their three grades of gas to Tall, Grande, and Venti!",
            "What's invisible and smells like carrots? Rabbit farts.",
            "A recent study has found that women who carry a little extra weight live longer than the men who mention it."
    };

    public String getRandomJoke(){
        Random rm = new Random();
        return joke[rm.nextInt(joke.length)];
    }}

