package linkedList;


import classes.Node;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        //inner class, nested class

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
Node newNode = new Node(value);
head = newNode;
tail = newNode;
length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }



}
