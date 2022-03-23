public class main
{
    public static void main(String[]args)
    {
        WeirdQueue weird= new WeirdQueue();

        System.out.println(weird.dequeue());

        System.out.println("");

        weird.enqueue(1);
        weird.enqueue(2);
        weird.enqueue(3);
        weird.enqueue(4);
        weird.enqueue(5);

        System.out.println(weird.dequeue());
        System.out.println(weird.dequeue());
        System.out.println(weird.dequeue());
        System.out.println(weird.dequeue());
        System.out.println(weird.dequeue());
        System.out.println(weird.dequeue());
    }
}
