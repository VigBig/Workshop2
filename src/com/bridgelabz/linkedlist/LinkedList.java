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




}
