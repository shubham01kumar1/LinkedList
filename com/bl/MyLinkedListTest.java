package com.bl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bl.MyLinkedList;
import com.bl.MyNode;

class MyLinkedListTest {

    @Test
    void given3NumbersWhenLinkedShouldBeAtAParticularPosition() {
        int position = 2;
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(30);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.addingAtPosition(myThirdNode, position);

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(myThirdNode)
                && myLinkedList.head.getNext().getNext().equals(mySecondNode);
        assertTrue(result);
    }

    @Test
    void given3NumbersWhenLinkedShouldBeAppendAtEnd() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.head.getNext().getNext().equals(myThirdNode);
        assertTrue(result);
    }

        @Test
        void given3NumbersWhenLinkedShouldBeAddedAtBeginning() {
            MyNode<Integer> myFirstNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(56);

            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.add(mySecondNode);
            myLinkedList.add(myThirdNode);

            myLinkedList.printMyNodes();

            boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                    && myLinkedList.head.getNext().getNext().equals(myFirstNode);
            assertTrue(result);
        }

    @Test
    void given3NumbersWhenPopShouldDeleteTheFirstNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        myLinkedList.printMyNodes();

        myLinkedList.pop();     //deleting the first node
        System.out.println("After pop: ");
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode)
                && myLinkedList.head.getNext().getNext() == null;
        assertTrue(result);
    }
}