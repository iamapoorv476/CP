import java.util.Arrays;
class selection{
    // public static void selectionSorting(int arr[])
    // {
    //     for(int i = 0; i< arr.length - 1; i++)
    //     {
    //         int minPos = i;
    //         for(int j = i + 1; j<arr.length; j++)
    //         {
    //             if(arr[minPos] < arr[j])
    //             {
    //                 minPos = j;
    //             }
    //             int temp = arr[minPos];
    //             arr[minPos] = arr[i];
    //             arr[i] = temp;
    //         }

    //     }
    // }
    public static void insertionSort(int  arr[])
    {
        for(int i = 1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[curr];
        
        }
    }

    public static void printarr(int arr[])
    {
        for(int k = 0; k< arr.length; k++)
        {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {2,1,4,5,3,3};
        // insertionSort(arr);
        Arrays.sort(arr, 0 ,3);
        printarr(arr);
        
    }


}
    

