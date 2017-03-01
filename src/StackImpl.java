

import java.util.*;



public class StackImpl<E> implements Stack {

    java.util.Stack mystack;
    int maxsize;

    public StackImpl (int pMaxSize) {
        this.mystack = new java.util.Stack();
        this.maxsize = pMaxSize;
    }

    public void push(Object pElement) throws CustomException {
        if(this.size() < maxsize)
            this.mystack.push((E)pElement);
        else
            throw new CustomException("es.com.xfrost.lab2.FullStackException");
    }

    public E pop() throws EmptyStackException {
        try {
            E res = (E)this.mystack.pop();
            return res;
        }
        catch (EmptyStackException ex) {
            throw ex;
        }
    }

    public int size() {
        return this.mystack.size();
    }
}