public class BubbleSort{
    static void bubbleSort(int arr[])
    {
        int temp = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array : ");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

    

    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        bubbleSort(new int[]{45,23,33,2,1,30,10});
        long end = System.currentTimeMillis();

        System.out.println("Time taken for bubble sort : "+(end-start));
      //int[] arr = new int[]{45,23,33,2,1,30,10};
    //   for(int i = 0;i<arr.length;i++)
    //     {
    //         for(int j = 0;j<arr.length;j++)
    //         {
    //             System.out.println("i"+arr[i]);
    //             System.out.println("j"+arr[j]);
    //         }
    //     }
}
}