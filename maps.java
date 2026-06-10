import java .util.*;
public class maps {
   public static void main(String args[]){
    int arr[]={1,4,5,67,2,5,7,1,1,1,4,1};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i =0; i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
    }
    for (Integer key : map.keySet()) {
        if(map.get(key) > arr.length/3){
            System.out.println(key);
        }
        
    }
   } 
    
}
