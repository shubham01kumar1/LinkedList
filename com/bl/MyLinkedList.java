package com.bl;

public class MyLinkedList<E> {
    public INode<E> head;

    public MyLinkedList() {
        this.head = null;
    }

    // adding node at the beginning of linklist
    public void add(INode<E> newNode) {

        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode<E> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //adding node at the end of linklist
    public void append(INode<E> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode temp = head;
            while(temp.getNext() !=null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    //printing linkList
    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }
}
