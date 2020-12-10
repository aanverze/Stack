public class ArrayStack<T> implements Stack<T> {
    private int last;
    private int top;
    private T[] stack;
    private int capacity;

    public ArrayStack() {
        int size = 10;
        top = 0;
        last = 0;
        stack = (T[]) new Object[size];
        capacity = size;
    }

    public ArrayStack(int size) {
        top = 0;
        last = 0;
        stack = (T[]) new Object[size];
        capacity = size;
    }

    public boolean isFull() {
        return last == capacity - 1;
    }

    @Override
    public void push(T data) {

        stack[top++] = data;
    }

    @Override
    public T pop() {
        T data;

        if (isEmpty())
            throw new IndexOutOfBoundsException("Fim da pilha!");

        data = stack[0];
        for (int i = 0; i > top; i++) {
            stack[i] = stack[i+1];
        }
        top--;
        return null;
    }

    @Override
    public boolean isEmpty() {
        return top == last;
    }
}
