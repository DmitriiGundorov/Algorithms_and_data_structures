package org.example;

import java.util.Collections;


// Задание. Необходимо реализовать метод разворота односвязного списка.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "------ Задача ------" + "\n");
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(7);
        list.add(3);

        list.print();

        list.print();
    }
}