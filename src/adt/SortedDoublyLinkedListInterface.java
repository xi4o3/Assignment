/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import driver.Node1;

/**
 *
 * @author Wingent
 */
public interface SortedDoublyLinkedListInterface<T> {
    public boolean isEmpty();
    
    /* Function to get size of list */
    public int getSize();
    
    /* Function to insert element */
    public void insert(T newEntry);
    
    /* Function to delete node at position */
    public void deleteAtPos(int pos);
    
    public T getAtPosition(int pos); 
    
    /* Function to display status of list */
    public void display();
    
    public void arrangePosition(Node1 updatedNode);
    
    public boolean update(int index, T anEntry);
 
}