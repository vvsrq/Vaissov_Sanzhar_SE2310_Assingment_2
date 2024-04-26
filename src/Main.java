public class Main {
    public static void main(String[] args) {

        LinkedList list_1 = new LinkedList();
        //Ins(insert)
        System.out.println("----------------------------------------");
        System.out.println("adding 5 6 7 9");
        list_1.Ins(5);
        list_1.Ins(6);
        list_1.Ins(7);
        list_1.Ins(9);
        list_1.Show();
        //Ins(insert at start)
        System.out.println("----------------------------------------");
        System.out.println("adding 11 at the start");
        list_1.Ias(11);
        list_1.Show();
        //Ini(insert by index)
        System.out.println("----------------------------------------");
        System.out.println("adding 55 at the 0 index");
        list_1.Ibi(0,55);
        list_1.Show();
        //DelA(delate at)
        System.out.println("----------------------------------------");
        System.out.println("delliting the 2 element");
        list_1.DelA(2);
        list_1.Show();
        //Show means print all linked list
        System.out.println("----------------------------------------");
        list_1.Show();
        //Showbi(show by index)
        System.out.println("----------------------------------------");
        list_1.Showbi(0);
        list_1.Showbi(3);
        list_1.Show();
        //Sort == sort
        System.out.println("----------------------------------------");
        list_1.Sort();
        list_1.Show();
        //size of linked list
        System.out.println("----------------------------------------");
        System.out.println("Size of linked list");
        list_1.Size();
        list_1.Show();
        //Clear == clear
        System.out.println("----------------------------------------");
        System.out.println("Clearing linked list");
        list_1.Clear();
        list_1.Show();
        System.out.println("----------------------------------------");


        MyStack nums = new MyStack();
        nums.push(15);
        nums.push(8);

        System.out.println(nums.peek());

        nums.push(10);

        System.out.println(nums.sizest());

        nums.pprint();

        System.out.println();

        System.out.println("empty "+nums.isEmpty());
    }
}