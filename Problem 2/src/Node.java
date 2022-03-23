public class Node
{
    private Object obj;
    private Node next;
    private Node prev;

    //Initializer for the Node
    public Node(Object obj, Node next, Node prev)
    {
        this.obj=obj;
        this.next=next;
        this.prev=prev;
    }

    //Returns data contained in the Node
    public Object getObj()
    {
        return obj;
    }

    //Returns pointer to next Node in List
    public Node getNext()
    {
        return next;
    }

    //Returns pointer to previous Node in List
    public Node getPrev()
    {
        return prev;
    }

    //Sets value of obj
    public void setObj(Object newObj)
    {
        obj=newObj;
    }

    //Sets Node to point to new next Node
    public void setNext(Node newNode)
    {
        next= newNode;
    }

    //Sets Node to point to new previous Node
    public void setPrev(Node newNode)
    {
        prev=newNode;
    }
}
