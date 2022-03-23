public class main
{
    public static void main(String[]args)
    {
        int array[]= new int[]{0,1,2,3,4,5,6,7,8,9};
        BinarySearchTree tree= new BinarySearchTree();
        tree.ArrayToTree(array, 0, array.length-1);

        System.out.println();
        System.out.println("Preorder");
        //tree.preOrder();

        System.out.println();
        System.out.println("Postorder");
        tree.postOrder();

        System.out.println();
        System.out.println("Inorder");
        tree.InOrder();
    }
}
