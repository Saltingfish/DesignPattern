package com.example.compositeItertor;

import java.util.Iterator;

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    //空迭代器当然不支持remove
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
