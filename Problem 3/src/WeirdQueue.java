import java.util.Stack;

public class WeirdQueue
{
    private MyStack<Object> weird1;
    private MyStack<Object> weird2;

    public WeirdQueue()
    {
       weird1 =new MyStack<Object>();
       weird2 =new MyStack<Object>();
    }

    //Worst case O(1)
    public void enqueue(Object item)
    {
        weird1.push(item);
    }

    //Worst case O(n)
    //Error condition if WeirdQueue is empty, returns null
    public Object dequeue()
    {
        if(!weird1.isEmpty())
        {
            while(weird1.size()>0)
            {
                weird2.push(weird1.pop());
            }

            Object popped=weird2.pop();

            while(weird2.size()>0)
            {
                weird1.push(weird2.pop());
            }

            return popped;
        }

        return "Cannot dequeue item, list is empty";
    }
}
