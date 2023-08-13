package org.example;

public class LinkedList<T> {


    public int size() {
        return size;
    }

    // Добавление нода
    public void add(T value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    // Печать списка
    public void print() {
        Node currentNode = root;
        System.out.print("{");
        while (currentNode.next != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.value + "}\n" + "Размер списка: " + size + "\n" + "    -------------\n");
    }

    //метод разворота списка


    private class Node {
        T value;
        Node next;


        Node(T value) {
            this.value = value;
        }
    }

    private Node root;

    private int size;

    public Node reverseList(Node root) {
        Node previousNode = null;
        Node currentNode = root;
        Node nextNode;
        while (currentNode != null) {  // обход списка
            nextNode = currentNode.next;
            currentNode.next = previousNode; // фиксация текущего узла
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

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
