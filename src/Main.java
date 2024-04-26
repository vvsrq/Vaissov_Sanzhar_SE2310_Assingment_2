public class Main {
    public static void main(String[] args) {

        LinkedList list_1 = new LinkedList();
        //Ins(insert)
        System.out.println("----------------------------------------");
        System.out.println("adding 5 6 7 9");
        list_1.insert(5);
        list_1.insert(6);
        list_1.insert(7);
        list_1.insert(9);
        list_1.printLinkedList();
        //Ins(insert at start)
        System.out.println("----------------------------------------");
        System.out.println("adding 11 at the start");
        list_1.insertAtStart(11);
        list_1.printLinkedList();
        //Ini(insert by index)
        System.out.println("----------------------------------------");
        System.out.println("adding 55 at the 0 index");
        list_1.insertByIndex(0,55);
        list_1.printLinkedList();
        //DelA(delate at)
        System.out.println("----------------------------------------");
        System.out.println("delliting the 2 element");
        list_1.deliteAt(2);
        list_1.printLinkedList();
        //Show means print all linked list
        System.out.println("----------------------------------------");
        list_1.printLinkedList();
        //Showbi(show by index)
        System.out.println("----------------------------------------");
        list_1.showByIndex(0);
        list_1.showByIndex(3);
        list_1.printLinkedList();
        //Sort == sort
        System.out.println("----------------------------------------");
        list_1.sort();
        list_1.printLinkedList();
        //size of linked list
        System.out.println("----------------------------------------");
        System.out.println("Size of linked list");
        list_1.size();
        list_1.printLinkedList();
        //Clear == clear
        System.out.println("----------------------------------------");
        System.out.println("Clearing linked list");
        list_1.clear();
        list_1.printLinkedList();
        System.out.println("----------------------------------------");

        System.out.println("Creating a stack");
        MyStack<Integer> stack = new MyStack<>(5);
        System.out.println("adding 10 20 30 40 10");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(13);
        stack.printStack();
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("The highest element is "+stack.peek());
        System.out.println("----------------------------------------");
        System.out.println("Delliting the highest element  "+stack.pop());
        stack.printStack();
    }
}