package Btap12;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList(int size, Object[] element) {
        this.size = size;
        this.element = element;
    }

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public void add(E element) {
        this.element[size] = element;
        size++;
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            this.element[i] = this.element[i + 1];
        }
        this.element[size - 1] = null;
        size--;
        return (E) element;
    }

    public int size() {
        return size;
    }


    public MyList<E> clone() {
        try {
            MyList<E> newList = (MyList<E>) super.clone();
            newList.element = this.element.clone();
            return newList;
        } catch (CloneNotSupportedException e) {
            // Handle the exception if necessary
            return null;
        }
    }

    public boolean contains(E o) {
        for (Object item : element) {
            if (item == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < element.length; i++) {
            if (o == element[i]) {
                return i;
            }
        }
        return 0;
    }
    public E get (int i){
        for (int j = 0; j < element.length; j++) {
            if(j == i){
                System.out.println(element[j]);
            }
        }
        return null;
    }
    public E clear() {
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
        return null;
    }
    public void ensureCapacity(int minCapacity) {
        int currentCapacity = element.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = currentCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            element = Arrays.copyOf(element, newCapacity);
        }
    }
}




