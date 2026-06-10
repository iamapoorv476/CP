public class Natural {
    // public static boolean Sorting(int arr[] , int i)
    // {
    //     if(i == arr.length-1)
    //     {
    //         return true;
    //     }
    //     if(arr[i] > arr[i+ 1])
    //     {
    //         return false;
    //     }
    //     return Sorting(arr, i+1);
    // }
    // // 
    public static int Occurrence(int arr[] , int i, int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return Occurrence(arr, key , i+1);
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,3,4,5,6,9};
        System.out.println(Occurrence(arr, 0 , 5));

        
        
    }
}
