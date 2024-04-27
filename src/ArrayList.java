public class ArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;

    public ArrayList() {
        arr = (T[]) new Object[10];
        size = 0;
    }

    private void increaseList() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        if (size >= 0) System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    private void checker(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index goes outside the list");
    }

    @Override
    public void add(T item) {
        if (size >= arr.length) {
            increaseList();
        }
        arr[size++] = item;
    }


    @Override
    public void set(int index, T item) {
        try {
            checker(index);
            arr[index]=item;
        }catch (Exception e){
            System.out.println("An error occurred in(set) : " + e.getMessage());
        }
    }

    @Override
    public void add(int index, T item) {
        try {
            if (size >= arr.length) {
                increaseList();
            }
            checker(index);
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = item;
            size++;
        }catch (Exception e){
            System.out.println("An error occurred in(add) : " + e.getMessage());
        }
    }


    @Override
    public void addFirst(T item) {
        if (size >= arr.length) {
            increaseList();
        }
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        arr[size] = item;
        size++;
    }

    @Override
    public T get(int index) {
        try {
            checker(index);
            return arr[index];
        }catch (Exception e){
            System.out.println("An error occurred in(get) : " + e.getMessage());
            return null;
        }
    }

    //teachet said that its a wrong code
    @Override
    public T getFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("first empty");
        }
        return arr[0];
    }

    @Override
    public T getLast() {
        if(size==0){
            throw new IndexOutOfBoundsException("last empty");
        }
        return arr[size-1];
    }

    @Override
    public void remove(int index) {
        try {
            checker(index);
            for (int i = index + 1; i < size; i++) {
                arr[i-1] = arr[i];
            }
            size--;
        }catch (Exception e){
            System.out.println("An error occurred in(remove) : " + e.getMessage());
        }
    }

    @Override
    public void removeFirst() {
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("last empty");
        }
        arr[size - 1] = null;
        size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

}
