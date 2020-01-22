package com.dupel.lector_tasks.task1;

import java.util.Arrays;

// Класс - обертка стандарстного массива строк
public class CustomArray {
    private int n;
    private String[] a;
    // Конструкторы
    public CustomArray(int n) {
        this.n = n;
        a = new String[n];
    }

    public CustomArray(int n, String[] a) {
        this.n = n;
        this.a = a;
    }
    //
    private boolean out_of_index(int index){
        return   !( 0 <= index && index < n);
    }
    //  Вернуть длинну
    public int length() {
        return a.length;
    }

    // Метод получения элемента массива
    public String getElem(int index) {
        if (!out_of_index(index)) {
            return a[index];
        } else {
            System.out.println("Exeption: out of index");
            return null;
        }
    }
    // Метод изменения элемента массива
    public void setElem(int index,String value){
            if (!out_of_index(index)){
                a[index] = value;
            }
            else{
                System.out.println("Exeption: out of index");
            }

     }

     // Возвращает True, если в массиве найден элемент
     public boolean find(String elem){
        for ( String val: a)
            if(val == elem)
                return true;
        return false;
     }
     public void appendWithoutDup(CustomArray c) {
         int newN = n;
         // Найдем дупликаты
         boolean[] expect = new boolean[c.length()];
         for(int i = 0; i < c.length(); i++ ){
            expect[i] = find(c.getElem(i));
            if (!expect[i])
                newN ++;
         }
         // Создадим новый массив
         String[] newA = new String[newN];
         // Скопируем содержимое первого массива
         for (int i = 0; i < n; i++) {
             newA[i] = a[i];
         }
         // Добавим новые элементы из второго массива
         for(int i = 0, j = 0; i < c.length(); i++) {
            // Если новый элемент
             if(!expect[i]){
                 newA[n+j] = c.getElem(i);
                 j++;
             }
         }
         // Изменяем внутренние переменные
         a = newA;
         n = newN;
     }

    @Override
    public String toString() {
        return "CustomArray{" +
                "n=" + n +
                ", a=" + Arrays.toString(a) +
                '}';
    }

}

