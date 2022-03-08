package com.company;

public class Main {

    public static void main(String[] args) {

        Recipe chickenSalad = new Recipe("Chicken Salad", 10, 30);
        System.out.println(chickenSalad.shortTime(25));
        System.out.println(chickenSalad.shortTimeText(45));
        System.out.println(chickenSalad.shortTimeText());



    }
}
