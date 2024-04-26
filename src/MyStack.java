class MyStack<T> {
    private T[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        arr = (T[]) new Object[size]; // Create generic array
        capacity = size;
        top = -1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        arr[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        MyStack<T> tempStack = new MyStack<>(capacity);
        while (!isEmpty()) {
            T element = pop();
            System.out.print(element + " ");
            tempStack.push(element);
        }

        while(!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }
}
