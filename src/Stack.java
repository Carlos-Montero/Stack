

import java.util.EmptyStackException;


public interface Stack <E> {
    void push(E pElement) throws CustomException;
    E pop() throws EmptyStackException;
    int size();
}