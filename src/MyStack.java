public class MyStack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if (top==4){
            System.out.println("Stack it full");
        }
        stack[top] = data;
        top++;
    }

    public void pprint(){
        for (int n : stack){
            System.out.print(n+" ");
        }
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }

    public int sizest(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }
}
