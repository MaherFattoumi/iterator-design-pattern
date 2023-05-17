package com.mf.iterator;

import java.util.Iterator;
import java.util.List;

public class MyCollection<T> implements Iterable<T> {
    private final List<T> elements;

    public MyCollection(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.size();
        }

        @Override
        public T next() {
            T element = elements.get(currentIndex);
            currentIndex++;
            return element;
        }
    }
}


