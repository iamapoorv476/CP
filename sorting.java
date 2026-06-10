import java.util.*;
class sorting{

    public static void bubbleSort(int arr[])
    {
        for(int i = 0; i< arr.length-1; i++)
        {
            for(int j = 0; j<arr.length-1-i; j++)
            {
                if(arr[j]< arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  }
            }
        }
    }
    public static void printArr(int arr[])
    {
        for(int k = 0; k<arr.length; k++)
        {
            System.out.print(arr[k]  +" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,5,6,7,5};
        bubbleSort(arr);
        printArr(arr);
    }
}
    

