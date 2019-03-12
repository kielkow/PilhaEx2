package pilhaex2;

import java.util.EmptyStackException;


public interface Interface {
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public void push(char elemento);
    public int pop() throws EmptyStackException;
    public char top() throws EmptyStackException;
}
