package adt;

import entity.DeliveryMan;

public class DMSortedLinkedList<T extends Comparable<? super T>> implements DMSortedListInterface<T> {

  private Node firstNode;
  private Node tempFirstNode;
  private int length;

  public DMSortedLinkedList() {
    firstNode = null;
    length = 0;
  }

  public boolean add(T newEntry) {
    firstNode = add(newEntry,firstNode);
    length++;
    return true;
  }
    public Node add(T newEntry,Node currentNode){
        if(currentNode == null || newEntry.compareTo(currentNode.data)<=0){
            currentNode = new Node(newEntry, currentNode);
        }else{
            Node nodeAfter = add(newEntry, currentNode.next);
            currentNode.next = nodeAfter;
        }
        return currentNode;
    }


    public T getEntry(int givenPosition) {
      T result = null;

      if ((givenPosition >= 1) && (givenPosition <= length)) {
        Node currentNode = firstNode;
        for (int i = 0; i < givenPosition - 1; ++i) {
          currentNode = currentNode.next;		// advance currentNode to next node
        }
        result = currentNode.data;	// currentNode is pointing to the node at givenPosition
      }

      return result;
    }

  public boolean contains(T anEntry) {
    boolean found = false;
    Node currentNode = firstNode;

    while (!found && (currentNode != null)) {
      if (anEntry.equals(currentNode.data)) {
        found = true;
      } else {
        currentNode = currentNode.next;
      }
    }

    return found;
  }

  public T remove(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length)) {
      if (givenPosition == 1) {      	// CASE 1: remove first entry
        result = firstNode.data;     	// save entry to be removed 
        firstNode = firstNode.next;		// update firstNode to point to the next node
      } else {                         	// CASE 2: remove interior entry or last entry
        Node nodeBefore = firstNode;
        for (int i = 1; i < givenPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
        }
        result = nodeBefore.next.data;  	// save entry to be removed	
        nodeBefore.next = nodeBefore.next.next;	// make node before point to node after the 
      } 															// one to be deleted (to disconnect node from chain)

      length--;
    }

    return result;
  }

  public final void clear() {
    firstNode = null;
    length = 0;
  }

  public int getLength() {
    return length;
  }

  public boolean isEmpty() {
    return (length == 0);
  }

  public boolean isFull() {
    return false;
  }

  public String toString() {
    String outputStr = "";
    Node currentNode = firstNode;
    while (currentNode != null) {
      outputStr += currentNode.data + "\n";;
      currentNode = currentNode.next;
    }
    return outputStr;
  }

    private class Node {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }//end node
}
