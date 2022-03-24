public class main
{
    public static void main(String[]args)
    {
        int array[]= new int[]{};
        BinarySearchTree tree= new BinarySearchTree();
        tree.ArrayToTree(array, 0, array.length-1);

        System.out.println();
        System.out.println("Preorder");
        tree.preOrder();

        System.out.println();
        System.out.println("Postorder");
        tree.postOrder();

        System.out.println();
        System.out.println("Inorder");
        tree.inOrder();
    }
}
