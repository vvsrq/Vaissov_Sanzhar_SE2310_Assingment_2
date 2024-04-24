public class LinkedList {
    Node head = null;

    public void Ins(int data){
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void Show(){
        Node node = head;
        if (node == null){
            System.out.println("linked list is null");
        }
        else {
            while (node.next != null){
                System.out.print(node.data+" ");
                //System.out.print(node+" ");
                //System.out.print(System.identityHashCode(node)+" ");
                node = node.next;
            }
            System.out.println(node.data);
            //System.out.println(node);
            //System.out.println(System.identityHashCode(node)+" ");
        }
    }

    public void Ias(int data){
        Node node = new Node(data);
        node.data = data;
        node.next = head;

        head = node;
    }

    public void Ibi(int index, int data){
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if (index == 0){
            Ias(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void DelA(int index){
        if (index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void Showbi(int index){
        Node node = head;

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
    public void Sort() {
        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void Size(){
        int size = 0;
        Node node = head;
        while (node.next != null){
            size++;
            node = node.next;
        }
        size++;
        System.out.println(size);
    }

    public void Clear() {
        Node current = null;
        while (current != null){
            Node temp = current.next;
            current = temp;
        }
        head = null;
    }
}
