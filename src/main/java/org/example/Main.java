package org.example;

import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Задание. Реализовать метод разворота односвязного списка." + "\n");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(7);
        list.add(3);
        System.out.println("Связный список:");
        list.print();
        System.out.println("Реверсивный список:");
        list.reverseList();
        list.print();
    }
}