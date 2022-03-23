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

        private int getData()
        {
            return data;
        }
    }

    private TreeNode root=null;
    boolean pointer=false;

    public void InOrder()
    {
        InOrder(root);
    }

    private void InOrder(TreeNode toPrint)
    {
        if(toPrint.left!=null)
        {
            InOrder(toPrint.left);
        }

        System.out.print(toPrint.getData() + " ");

        if(toPrint.right!=null)
        {
            InOrder(toPrint.right);
        }
    }

    public void postOrder()
    {
        postOrder(root);
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

        System.out.print(toPrint.getData() + " ");
    }


    public TreeNode ArrayToTree(int array[], int low, int high)
    {
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
