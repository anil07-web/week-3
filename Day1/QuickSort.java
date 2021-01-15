import java.util.Arrays;

public class QuickSort {
    static void quickSort(int a[],int start,int end)
    {
        int partition = partition(a, start, end);
        if(partition - 1 > start)
            quickSort(a, start, partition - 1);
        if(partition+1 < end)
            quickSort(a, partition+1, end);
       
    }
    static int partition(int a[],int start,int end)
    {
        //choose pivot
        int pivot = a[end];
        //loop through the array
        for(int i = start;i<end;i++)
        {
            //check for elements that are less than pivot
            //swap accordingly
            if(a[i]<pivot)
            {
                swap(a,start,i);
                start++;
            }
        }
        swap(a,start,end);
        return start;

    }
    static void swap(int a[],int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    public static void main(String[] args) {
        int [] a = {45,23,33,2,1,30,10};
        long start = System.currentTimeMillis();
        quickSort(a, 0,a.length-1);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for quick sort : "+(end-start));
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
       // System.out.println(Arrays.toString(a));
    }
}
