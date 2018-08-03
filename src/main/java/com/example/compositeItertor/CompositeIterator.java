package com.example.compositeItertor;

import com.example.composite.Menu;
import com.example.composite.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        //将我们要遍历的顶层组合的迭代器传入。我们把它抛进一个堆栈数据结构中
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty( )) {
            return false;
        } else {
            //想要知道是否还有下一个元素，检查堆栈是否被清空
            //如果已经空了表示没有下个元素

            Iterator iterator = (Iterator) stack.peek();
            //否则，就从堆栈的顶层中取出迭代器，看看是否有下个元素。
            //如果他没有元素，我们将它弹出堆栈，然后递归调用hasNext()
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
             //   stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
    //不支持删除只有遍历
    public void  remove(){
        throw new UnsupportedOperationException();
    }
}
