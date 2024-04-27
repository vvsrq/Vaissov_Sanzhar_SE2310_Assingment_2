public class LinkedList<T> implements MyList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }


    private void checker(int index){
    }


    @Override
    public void add(T item) {
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

    @Override
    public void set(int index, T item) {
    }

    @Override
    public void add(int index, T data) {
        Node<T> node = new Node<>(data);
        node.data = data;
        node.next = null;

        if (index == 0){
            addFirst(data);
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

    @Override
    public void addFirst(T data){
        Node<T> node = new Node<>(data);
        node.data = data;
        node.next = head;

        head = node;
    }

    @Override
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    @Override
    public void remove(int index){
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

    @Override
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    @Override
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }


    @Override
    public T get(int index){
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
        return null;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
    //just a simple bubble-sort
    @Override
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

    @Override
    public int size(){
        int size = 0;
        Node<T> node = head;
        while (node.next != null){
            size++;
            node = node.next;
        }
        size++;
        System.out.println(size);
        return size;
    }

    @Override
    public void clear() {
        Node<T> current = null;
        while (current != null){
            Node<T> temp = current.next;
            current = temp;
        }
        head = null;
    }

    @Override
    public int indexOf(Object object) {
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }


}