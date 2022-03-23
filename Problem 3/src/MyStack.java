import java.util.ArrayList;

public class MyStack<T>
{
    private ArrayList<T> list;
    private int size;

    public MyStack()
    {
        list= new ArrayList<T>();
        size=0;
    }

    public void push(T item)
    {
        if(list.size()==0)
        {
            list.add(item);
        }
        else
        {
            list.add(0,item);
        }
        size++;
    }

    public T pop()
    {
        size--;
        return list.remove(0);
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
