package com.dupel.lector_tasks.task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Создадим улучшенный массив длинны 3
        CustomArray a  = new CustomArray(3);
        // Добавим в него новые элементы
        a.setElem(0,"Hey");
        a.setElem(1,"world, ");
        a.setElem(2,"hello");
        // Выведем содержимое на экран
        System.out.println(a.toString() );
        // Сцепим его с усовершенствованным массивом длинны 3
        a.appendWithoutDup(new CustomArray(3, new String[]{"hello", "hello", "yello"}));
        // Выведем содержимое на экран
        System.out.println(a.toString());
        // Попробуем ввести недопустимый индекс
        a.setElem(-4,"lala");
    }
}
