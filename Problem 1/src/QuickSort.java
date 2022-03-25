
public class QuickSort
{
    public static void main(String[] args)
    {
        int array[]= new int[]{8,6,7,5,4,1,2,9,0,3};
        my_quicksort(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void my_quicksort(int[] array)
    {
        quicksort_helper(array, 0, array.length-1);
    }

    private static void quicksort_helper(int[] array, int low, int high)
    {
        if (low < high)
        {
            int partition = partition(array, low, high);

            quicksort_helper(array, partition + 1, high);
            quicksort_helper(array, low, partition - 1);
        }
    }

    private static int partition(int[] array, int low, int high)
    {
        int pivot = array[high];
        int partition = low-1;

        for(int i = low; i < high; i++)
        {
            if (array[i] > pivot)
            {
                partition++;
                swap(array, partition, i);
            }
        }
        swap(array, partition+1, high);
        return partition+1;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
