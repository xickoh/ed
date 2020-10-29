/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_ficha03;

import static java.lang.Math.round;

/**
 *
 * @author franc
 */
public class LinkedStack<T> implements StackADT<T> {

    /**
     * constant to represent the default capacity of the array
     */
    private final int DEFAULT_CAPACITY = 3; //Alterei para testar o expandCapacity
    /**
     * int that represents both the number of elements and the next available
     * position in the array
     */
    /**
     * array of generic elements to represent the stack
     */
    private LinearNode<T> top;
    private int size;

    @Override
    public void push(T element) {

        LinearNode newNode = new LinearNode(element);

        newNode.setNext(this.top);

        this.top = newNode;
        size++;
    }

    @Override
    public T pop() throws EmptyCollectionException {

        T element = (T) this.top.getElement();

        this.top = this.top.getNext();

        size--;

        return element;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        return this.top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return (this.top.getElement().equals(null)) ? true : false;
    }

    @Override
    public int size() {
        return this.size;
    }

}
