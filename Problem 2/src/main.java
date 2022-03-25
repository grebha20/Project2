
public class main
{
    public static void main(String[]args)
    {
        DLinkedList list = new DLinkedList();

        list.insert(0,5);
        list.replace(0, 5);
        list.remove(0);
        list.get(0);

        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);

        list.insert(0,4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        System.out.println(list.get(0));

//        list.clear();

        list.printList();
    }
}
