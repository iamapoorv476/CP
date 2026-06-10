import java.util.*;
public class Greedy {
    public static void main(String args[])
    {
        Integer coins[] ={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins ,Comparator.reverseOrder());
        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i< coins.length; i++)
        {
            if(coins[i] <= amount)
            {
                while(coins[i] <= amount)
                {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total coins used =" + count);
        for(int i = 0; i< ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        // int pairs[][] = {{5,24} ,{39,60},{5,28} ,{27,40} ,{50,90}};
        // Arrays.sort(pairs,Comparator.comparingDouble(o-> o[1]));
        // int chainLen = 1;
        // int chainEnd = pairs[0][1];
        // for(int i = 1; i<pairs.length; i++)
        // {
        //     if(pairs[i][0] > chainEnd)
        //     {
        //         chainLen++;
        //         chainEnd = pairs[i][1];
        //     }
        // }
        // System.out.println("max length of chain =" + chainLen);
        // int A[] = {2,4,2};
        // int b[] = {2,3,5};
        // Arrays.sort(A);
        // Arrays.sort(b);
        // int minDiff = 0;
        // for(int i = 0; i<A.length; i++)
        // {
        //     minDiff +=Math.abs(A[i] - b[i]);
        // }
        // System.out.println("min absolute difference =" + minDiff);
    }
    // public static void main(String args[])
    // {
    //     int start[]= {1,0,3,5,2,6,8};
    //     int end[]= {2,4,6,7,9,9,9};
    //     //sorting
    //     int activities[][]= new int[start.length][3];
    //     for(int i = 0;i<start.length; i++)
    //     {
    //         activities[i][0] = i;
    //         activities[i][1]= start[i];
    //         activities[i][2]  = end[i];
    //     }
    //     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
    //     int count = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     count= 1;
    //     ans.add(activities[0][0]);
    //     int lastEnd = activities[0][2];
    //     for(int i = 1; i< end.length;i++)
    //     {
    //         if(activities[i][1] >= lastEnd)
    //         {
    //             count++;
    //             ans.add(activities[i][0]);
    //             lastEnd= activities[i][2];
    //         }
    //     }
    //     System.out.println("max activities =" + count);
    //     for(int i = 0; i< ans.size(); i++)
    //     {
    //         System.out.print("A" + ans.get(i)+ " ");
    //     }
    //     System.out.println();
    // }
    
}
