/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;
import adt.SortedDoublyLinkedListInterface;
import driver.Node1;


/**
 *
 * @author Wingent
 */
public class SortedDoublyLinkedList <T extends Comparable<T>> implements SortedDoublyLinkedListInterface<T>{
    private Node1 start;
    public int size;
 
    /* Constructor */
    public SortedDoublyLinkedList()
    {
        start = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    
    /* Function to insert element */
    public void insert(T newEntry) {
        Node1 newData = new Node1(newEntry, null, null);
        T latestData = (T)newData.getData();
        Node1 tmp, ptr;        
        boolean ins = false;
        if(start == null)
            start = newData;
            
        else if (latestData.compareTo((T)start.getData()) >0)
        {
            newData.setNext(start);
            start.setPrevious(newData);
            start = newData;
            size++;
            return;
        }
        else 
        {
            tmp = start;
            ptr = start.getNext();
            while(ptr != null)
            {
                if(latestData.compareTo((T)tmp.getData()) <=0 && latestData.compareTo((T)ptr.getData()) >0)
                {
                    tmp.setNext(newData);
                    newData.setPrevious(tmp);
                    newData.setNext(ptr);
                    ptr.setPrevious(newData);
                    ins = true;
                    break;
                }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getNext();
                }
            }
            if(!ins)
            {
                tmp.setNext(newData);
                newData.setPrevious(tmp);
            }
        }
        size++; //To change body of generated methods, choose Tools | Templates.
    }

    /* Function to delete node at position */
    public void deleteAtPos(int position)
    {        
        if (position == 1) 
        {
            if (size == 1)
            {
                start = null;
                size = 0;
                return; 
            }
            start = start.getNext();
            start.setPrevious(null);
            size--; 
            return ;
        }
        if (position == size) 
        {
            Node1 data = start;
 
            for (int i = 1; i < size - 1; i++)
                data = data.getNext();
            data.setNext(null);            
            size --;
            return;
        }
        Node1 data = start.getNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == position)
            {
                Node1 p = data.getPrevious();
                Node1 n = data.getNext();
 
                p.setNext(n);
                n.setPrevious(p);
                size-- ;
                return;
            }
            data = data.getNext();
        }        
    }    
   
    public T getAtPosition(int position)
    {  
       Node1 data;
       if (position == 1) 
        {
            data=start;
        } 
       else 
       {
           data = start;
 
            for (int i = 2; i <= position; i++)
                data = data.getNext();

       }

       return (T)data.getData();
    }
    
    /* Function to display status of list */
    public void display()
    {
        int i=1;
        if (size == 0) 
        {
            System.out.println("empty");
            return;
        }
        
        Node1 ptr = start;
        
        
        while (ptr.getNext() != null)
        {   
            System.out.printf("%3d" + ptr.getData().toString() + "\n", i);
            ptr = ptr.getNext();
            i++;
        }
        System.out.printf("%3d" + ptr.getData().toString() + "\n", size);
}
    
    public void arrangePosition(Node1 updatedNode) {
        Node1 currentNode = updatedNode;
        T currentData = (T)currentNode.getData();
        Node1 previous;
        Node1 next;
       
        //if(currentNode.getPrevious()!= null && currentNode.getData().compareTo(currentNode.getPrevious().getData())>0){
           while(currentNode.getPrevious()!= null && currentData.compareTo((T)currentNode.getPrevious().getData())>0){
                previous = currentNode.getPrevious();
                next = currentNode.getNext();
               
                 previous.setNext(currentNode.getNext());
                 if(next != null)
                   next.setPrevious(previous);
               
                currentNode.setPrevious(previous.getPrevious());
                if(previous.getPrevious() != null)
                    previous.getPrevious().setNext(currentNode);
                else
                    start = currentNode;
               
                previous.setPrevious(currentNode);
                currentNode.setNext(previous);  
           }
       //}
       //else if(currentNode.getNext()!= null && currentNode.getNext().getData().compareTo(currentNode.getData()) > 0){
            T currentNextData = null;
            if(currentNode.getNext() != null)
                currentNextData = (T)currentNode.getNext().getData();
            
            while(currentNode.getNext()!= null&& currentNextData.compareTo((T)currentNode.getData()) >= 0){
                previous = currentNode.getPrevious();
                next = currentNode.getNext();
                
                if(previous != null)
                    previous.setNext(currentNode.getNext());
                else
                    start = next;
                next.setPrevious(currentNode.getPrevious());
                
                currentNode.setNext(next.getNext());
                if(next.getNext() != null)
                    next.getNext().setPrevious(currentNode);
                
                currentNode.setPrevious(next);
                next.setNext(currentNode);
                
                if(currentNode.getNext() != null)
                    currentNextData = (T)currentNode.getNext().getData();
           }
       //}
       
    }
    
    public boolean update(int position, T anEntry){
        if(position >=1 && position <= size){
            Node1 data = start;
            int count = 1;
            
            
            if(size == 1 && position == 1){
                data.setData(anEntry);
                return true;
            }
            else{
                while(count != position){
                    data = data.getNext();
                    count++;
                }
                
                data.setValue(anEntry);
                arrangePosition(data);
                return true;
            }
        }
        else
            return false;
    }
    
}
