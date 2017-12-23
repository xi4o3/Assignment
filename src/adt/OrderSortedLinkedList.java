/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author DANSO
 */
public class OrderSortedLinkedList <T extends Comparable<? super T>> implements OrderSortedListInterface<T>{
    private Node first;
    private int entry;
    private int length;
    
    public OrderSortedLinkedList(){
        first = null;
        length = 0;
    }
    
    private class Node {

    private T data;
    private Node next;

    private Node(T dataPortion) {
      data = dataPortion;
      next = null;
    }

    private Node(T dataPortion, Node nextNode) {
      data = dataPortion;
      next = nextNode;
    }
  }
}
