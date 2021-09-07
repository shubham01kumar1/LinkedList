package com.bl;

public class MyLinkedList<E> {
    public INode<E> head;
    int size = 0;
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
        size++;
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
        size++;
    }

    //Inserting node in between two nodes
    public void addingAtPosition(INode<E> newNode, int pos) {
        if (pos == 1){
            add(newNode);
            size++;
        }
        else if(pos>1 && pos <= size+1){
            int count=1;
            INode<E> tempPrev = head;

            while(count < pos-1 && tempPrev.getNext() != null) {
                tempPrev=tempPrev.getNext();
                count++;
            }

            if(tempPrev.getNext() == null){
                tempPrev.setNext(newNode);
            }
            else {
                INode<E> tempNext = tempPrev.getNext();
                tempPrev.setNext(newNode);
                tempPrev.getNext().setNext(tempNext);
            }
            size++;
        }
        else
            System.out.println("Cannot add to this position as size of linked list is: " + size);
    }

    //deleting a node from start in the linked List
    public void  pop() {
        head=head.getNext();
    }

    //printing linkList
    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }
}
