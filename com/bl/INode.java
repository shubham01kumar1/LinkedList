package com.bl;

public interface INode<E> {
    E getValue();
    void setValue(E value);

    INode<E> getNext();
    void setNext(INode<E> next);

}
