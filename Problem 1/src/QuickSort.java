public class QuickSort
{
    public static void main(String[] args)
    {
        int array[]= new int[]{1,10,3,3,4,0,6,9,8,9,5,6};
        my_quicksort(array);
    }

    public static void my_quicksort(int[] array)
    {
        quicksort_helper(array, 0, array.length);
    }

    private static void quicksort_helper(int[] array, int low, int high)
    {
        int split= partition(array, low, high);
    }

    private static int partition(int[] array, int low, int high)
    {
        return 0;
    }
}
