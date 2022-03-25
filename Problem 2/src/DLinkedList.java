import java.util.List;

public class DLinkedList implements MyList
{
    private Node head=null;
    private Node tail= null;
    private Node curr= null;

    //Prints the list
    //Worst case runtime O(n)
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.getObj()+" ");
            tnode = tnode.getNext();
        }
    }

    //Inserts the element at the desired location, shifting every item back after that
    //Returns an error if the insertion point is out of bounds
    //Worst Case runtime O(n)
    @Override
    public boolean insert(int index, Object item)
    {
        Node newNode = new Node(item, null,null);

        if(index>size())
        {
            System.out.println("Error: insertion point out of bounds");
            return false;
        }

        else if(index==0)
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            head=newNode;
        }

        else
        {
            curr=head;

            for(int i=0; i<index; i++)
            {
                curr=curr.getNext();
            }
            newNode.setPrev(curr.getPrev());
            curr.getPrev().setNext(newNode);

            newNode.setNext(curr);
            curr.setPrev(newNode);
        }
        return true;
    }

    //Adds the Node to the end of the list,
    // Returns true after the Node has been added to the list.
    // Worst Case Runtime O(1)
    @Override
    public boolean append(Object item)
    {
        Node newNode= new Node(item, null, null);

        if(head==null)
        {
            head=newNode;
            tail=head;
        }

        else
        {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail=newNode;
        }
        return true;
    }

    //Clears the list of all its elements.
    //If the list is already empty, it returns an error message stating that
    //Worst Case Runtime O(1)
    @Override
    public void clear()
    {
        if(!isEmpty())
        {
            head=null;
        }
        else
        {
            System.out.println("NullPointerException: head is null");
        }
    }

    //Checks if the LinkedList is empty
    //Returns true if head doesn't point to a Node, false if it does
    //Worst Case Runtime is O(1)
    @Override
    public boolean isEmpty()
    {
        if (head==null)
        {
            return true;
        }
        return false;
    }

    //Checks what the size of the list is
    //Returns the size of the list if it has elements, returns -1 if it is empty
    //Worst runtime is O(n)
    @Override
    public int size()
    {
        if(!isEmpty())
        {
            int count=1;
            curr=head;
            while(curr.getNext()!=null)
            {
                count++;
                curr=curr.getNext();
            }
            return count;
        }
        return -1;
    }

    //Replaces the element at the desired location
    //Returns an error if the replacement point is out of bounds
    //Worst Case runtime O(n)
    @Override
    public boolean replace(int index, Object item)
    {
        if(index>size())
        {
            System.out.println("Error: Replacement point out of bounds");
            return false;
        }

        else if(index==0)
        {
            head.setObj(item);
        }

        else
        {
            curr=head;

            for(int i=0; i<index; i++)
            {
                curr=curr.getNext();
            }
            curr.setObj(item);
        }
        return true;
    }

    //Removes the Node at a specified point
    //Returns an error if the removal point is out of bounds
    //Worst Case runtime O(n)
    @Override
    public boolean remove(int index)
    {
        if(index>size())
        {
            System.out.println("Error: Removal point out of bounds");
            return false;
        }

        else if(index==0)
        {
            head=head.getNext();
        }

        else
        {
            curr=head;

            for(int i=0; i<index; i++)
            {
                curr=curr.getNext();
            }
            curr.getPrev().setNext(curr.getNext());
            curr.getNext().setPrev(curr.getPrev());
        }
        return true;
    }

    //Returns the value of the Node at a specified point
    //Returns an error if the retrieval point is out of bounds
    //Worst Case runtime O(n)
    @Override
    public Object get(int index)
    {
        if(index>size())
        {
            System.out.println("Error: Specified point out of bounds");
            return null;
        }

        else
        {
            curr=head;

            for(int i=0; i<index; i++)
            {
                curr=curr.getNext();
            }
            return curr.getObj();
        }
    }
}
