package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String args[]){

        System.out.println("Welcome to Linked List Program");

        System.out.println("Add operation:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.display();

        System.out.println();
        System.out.println("Append operation:");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        System.out.println();
        System.out.println("Pop operation:");
        linkedList2.pop();
        linkedList2.display();

        System.out.println();
        System.out.println("PopLast operation:");
        linkedList2.popLast();
        linkedList2.display();

        System.out.println();
        System.out.println("Delete Key operation:");
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(56);
        linkedList3.add(30);
        linkedList3.add(40);
        linkedList3.add(70);
        linkedList3.display();
        linkedList3.deleteKey(56);
        System.out.println();
        linkedList3.display();


    }


}
