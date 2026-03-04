// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: Deque.java

package mte2.deques;

import java.util.Iterator;

public interface Deque<E> extends Iterable<E> {
    
    public void enqueueFront(E element);
    public void enqueueBack(E element);
    public E dequeueFront();
    public E dequeueBack();
    public int size();    

    public Iterator<E> iterator(); 

}