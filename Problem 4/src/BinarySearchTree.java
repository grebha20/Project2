public class BinarySearchTree
{
    private class TreeNode
    {
        private int data;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int data, TreeNode left, TreeNode right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    private TreeNode root=null;
    boolean pointer=false;

    public void preOrder()
    {
        //Returns error message if the tree is empty
        if(root!=null)
        {
            preOrder(root);
        }
        else
        {
            System.out.println("Cannot print tree in preOrder format, tree is empty");
        }
    }

    public void preOrder(TreeNode toPrint)
    {
        System.out.print(toPrint.data + " ");

        if(toPrint.left!=null)
        {
            preOrder(toPrint.left);
        }

        if(toPrint.right!=null)
        {
            preOrder(toPrint.right);
        }
    }

    public void postOrder()
    {
        //Returns error message if the tree is empty
        if(root!=null)
        {
            postOrder(root);
        }
        else
        {
            System.out.println("Cannot print tree in postOrder format, tree is empty");
        }
    }

    private void postOrder(TreeNode toPrint)
    {
        if(toPrint.left!=null)
        {
            postOrder(toPrint.left);
        }

        if(toPrint.right!=null)
        {
            postOrder(toPrint.right);
        }

        System.out.print(toPrint.data + " ");
    }

    public void inOrder()
    {
        //Returns error message if the tree is empty
        if(root!=null)
        {
            inOrder(root);
        }
        else
        {
            System.out.println("Cannot print tree in inOrder format, tree is empty");
        }
    }

    private void inOrder(TreeNode toPrint)
    {
        if(toPrint.left!=null)
        {
            inOrder(toPrint.left);
        }

        System.out.print(toPrint.data + " ");

        if(toPrint.right!=null)
        {
            inOrder(toPrint.right);
        }
    }

    public TreeNode ArrayToTree(int array[], int low, int high)
    {
        //returns null if the given array is empty to prevent error conditions
        if (array.length==0)
        {
            return null;
        }

        int middle = low + (high - low) / 2;

        if(!pointer)
        {
            pointer=true;
            root= new TreeNode(array[middle], ArrayToTree(array, low, middle-1),
                    ArrayToTree(array, middle+1, high));
            return root;
        }

        if(high > low)
        {
            if(middle==low)
            {
                return new TreeNode(array[middle], null,
                        ArrayToTree(array, middle+1, high));
            }
            else if(middle==high)
            {
                return new TreeNode(array[middle],
                        ArrayToTree(array, low,middle-1),null);
            }
            else
            {
                return new TreeNode(array[middle], ArrayToTree(array, low, middle-1),
                        ArrayToTree(array, middle+1, high));
            }
        }

        else
        {
            return new TreeNode(array[middle], null, null);
        }
    }
}
