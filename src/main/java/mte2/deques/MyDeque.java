// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    private int size;
    
    public MyDeque() {    
        list = new LinkedList<>(); 
        size = 0;   
    }

    @Override
    public void enqueueFront( E element) {
        list.addFirst(element);
        size++;
    }

    @Override
    public void enqueueBack( E element) {
        list.addLast(element);
        size++;
    }

    @Override
    public E dequeueFront() {
        if (size == 0) {
            return null;
        }
        E first = list.removeFirst();
        size--;
        return first;
    }

    @Override
    public E dequeueBack() {
        if (size == 0) {
            return null;
        }
        E last = list.removeLast();
        size--;
        return last;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E elem = list.get(index);
                index++;
                return elem;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }



    public static void main(String[] args) { 

        MyDeque<String> deque = new MyDeque<>();
        deque.enqueueFront("a");
        deque.enqueueBack("b");
        deque.enqueueFront("c");
        deque.enqueueBack("d");
        deque.dequeueFront();
        deque.dequeueFront();
        System.out.println(deque.size());

        for (String element : deque) {
            System.out.println(element);
        }

    }
}