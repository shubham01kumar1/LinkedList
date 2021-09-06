package com.bl;

public class MyNode<E> implements INode<E> {
    private E value;
    private INode<E> next;

    public MyNode(E value) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public INode<E> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String myNodeString = "MyNode{" + "value=" + value  + "}";
        if (next !=null)
            myNodeString+= "->" + next + "";
        return myNodeString;
    }
}
