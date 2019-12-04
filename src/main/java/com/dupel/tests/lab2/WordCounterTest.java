package main.java.com.dupel.tests.lab2;

import com.dupel.labs.task2.WordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {
    WordCounter wc;
    @Test
    public void whitespacesAtTheBeginnig(){
        Assertions.assertEquals(1, wc.count("    X"));
        Assertions.assertEquals(1, wc.count("   X X"));
        Assertions.assertEquals(2, wc.count("   xxx  ooo xxx   "));
    }

    @Test
    public void empties() {
        Assertions.assertEquals(0, wc.count(""));
        Assertions.assertEquals(0, wc.count("        "));

    }

    @Test void multipleOccurences() {
        Assertions.assertEquals(1, wc.count("   xxx   xxx  xxx xxx xxx"));
    }

    @Test void f(){
        Assertions.assertEquals(1, wc.count("   {}}   "));
        Assertions.assertEquals(7, wc.count(" 88 &5 45 87 :::: ;; ' "));
        Assertions.assertEquals(8, wc.count(" Jeeeeee 88 &5 45 87 :::: ;; ' "));
    }
    //

}
