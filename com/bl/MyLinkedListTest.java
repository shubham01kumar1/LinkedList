package com.bl;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bl.MyLinkedList;
import com.bl.MyNode;

class MyLinkedListTest {

        @Test
        void given3NumbersWhenLinkedShouldBeAddedAtEnd() {
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
}