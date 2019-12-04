package main.java.com.dupel.labs.task3;

public class Counter {
    int result;

    public static int summFunction(int a, int b) {
        return a + b;
    }

    public static int multiplicationFunction(int a, int b) {
        return a * b;
    }

    public static void f(Integer a) {
        a = 2;
    }

    public static void main(String[] args) {
        //Integer intVal = 10;
        int intVal = new Integer(5);
        f(intVal);

        System.out.println(intVal);

    }
}
