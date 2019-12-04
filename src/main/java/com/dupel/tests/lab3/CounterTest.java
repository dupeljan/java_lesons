package main.java.com.dupel.tests.lab3;

import main.java.com.dupel.labs.task3.Counter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CounterTest {

    @Test
    public void summFunctionTest() {
        Assertions.assertEquals(4, Counter.summFunction(2,2));
        Assertions.assertEquals(8, Counter.summFunction(6,2));

    }

    @Test
    public void multiplicationFunctionTest() {
        Assertions.assertEquals(4, Counter.multiplicationFunction(2,2));
    }
}
