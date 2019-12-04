package main.java.com.dupel.labs.task2;

import com.dupel.labs.task2.WordCounter;

import java.util.Arrays;

// import here
// import a,c,main


public class Main {
    public static void main(String[] args) {

        WordCounter wc = new WordCounter();
        wc = new WordCounter();
        wc.setText("Привет привет привет привет привет привет мир");
        System.out.println(wc.to_string());
        System.out.println( Integer.toString(wc.count("a a a")));
    }

}

