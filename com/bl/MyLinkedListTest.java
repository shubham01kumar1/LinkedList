package com.bl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bl.MyLinkedList;
import com.bl.MyNode;

class MyLinkedListTest {

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
}