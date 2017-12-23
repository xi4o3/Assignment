
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author Wingent
 */
public class Node1 <T> {
    private T data; // entry in list
    private Node1 previous; // link to previous node
    private Node1 next; // link to next node
    
    public Node1(T data){
        this.data = data;
        previous = null;
        next = null; 
    }
    
    public Node1(T data, Node1 next) {
        this.data = data;
        previous = null;
        this.next = next;
    }
    
    public Node1(T data, Node1 next, Node1 previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
        
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public void setPrevious(Node1 previous){
        this.previous = previous;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }
    
    public Node1 getPrevious(){
        return previous;
    }

    public Node1 getNext() {
        return next;
    }
    
    public void setValue(T data) { 
        this.data = data; 
    }
}
