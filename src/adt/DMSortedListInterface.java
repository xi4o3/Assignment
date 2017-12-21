package adt;

import entity.DeliveryMan;

public interface DMSortedListInterface<T extends Comparable<? super T>> {

  public boolean add(T newEntry);
  
  public T getEntry(int givenPosition);

  public boolean contains(T anEntry);

  public T remove(int givenPosition);

  public void clear();

  public int getLength();

  public boolean isEmpty();

  public boolean isFull();
}
