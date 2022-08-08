package com.bridgelabz.linkedlist;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;

    public void add(E key){
        Node<E> newNode = new Node<>(key);

        if(head == null){

            head = newNode;
            tail = newNode;

        }else{

            newNode.next = head;
            head = newNode;

        }

    }

    public void append(E key){
        Node<E> newNode = new Node<>(key);

        if(tail == null){

            head = newNode;
            tail = newNode;

        }else{

            tail.next = newNode;
            tail = newNode;

        }

    }

    public void display(){

        Node<E> temp = head;

        while(temp!= null){

            System.out.print(temp.key);

            if(temp.next!=null) {
                System.out.print("->");
            }

            temp = temp.next;
        }

    }

    public void pop(){

        if(head == null){

            System.out.println("List is empty");
        }else{

            head = head.next;

        }

    }

    public void popLast(){

        Node<E> temp = head;

        if(tail == null){

            System.out.println("List is empty");

        }else{

            while(temp!= null){

                if(temp.next==tail) {

                    temp.next = null;
                    tail = temp;

                    break;
                }

                temp = temp.next;
            }

        }

    }


}
