public class LinkedList<T> {
    Node<T> head = null;

    // Notice how the method parameters now use 'T'
    public void insert(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printLinkedList() {
        Node<T> node = head;
        if (node == null) {
            System.out.println("linked list is null");
        } else {
            while (node.next != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public void insertAtStart(T data){
        Node<T> node = new Node<>(data);
        node.data = data;
        node.next = head;

        head = node;
    }

    public void insertByIndex(int index, T data){
        Node<T> node = new Node<>(data);
        node.data = data;
        node.next = null;

        if (index == 0){
            insertAtStart(data);
        }
        else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deliteAt(int index){
        if (index == 0){
            head = head.next;
        }
        else {
            Node<T> n = head;
            Node<T> n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void showByIndex(int index){
        Node<T> node = head;

        if (index == 0){
            System.out.println(node.data);
        }
        else{
            for (int i = 0 ; i < index ; i++) {
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    //just a simple bubble-sort
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            Node<T> previous = null;

            while (current.next != null) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                previous = current;
                current = current.next;
            }
        } while (swapped);
    }

    public void size(){
        int size = 0;
        Node<T> node = head;
        while (node.next != null){
            size++;
            node = node.next;
        }
        size++;
        System.out.println(size);
    }

    public void clear() {
        Node<T> current = null;
        while (current != null){
            Node<T> temp = current.next;
            current = temp;
        }
        head = null;
    }
}