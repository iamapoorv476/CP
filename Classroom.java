import java .util.*;
class Classroom
{
    // public static int storeWater(ArrayList<Integer> list)
    // {
    //     // int maxWater = 0;
    //     // // brute force
    //     // for(int i = 0; i< list.size(); i++)
    //     // {
    //     //     for(int j = i+1; j<list.size(); j++)
    //     //     {
    //     //         int ht = Math.min(list.get(i), list.get(j));
    //     //         int width = j - i;
    //     //         int currWater = ht* width;
    //     //         maxWater = Math.max(maxWater , currWater);

    //     //     }
    //     // }
    //     // return maxWater;
    //     int maxWater = 0;
    //     int lp =0;
    //     int rp = list.size() - 1;
    //     while(lp< rp)
    //     {
    //         int ht = Math.min(list.get(lp ), list.get(rp));
    //         int width = rp - lp;
    //         int currWater = ht* width;
    //         maxWater = Math.max(maxWater,currWater);
    //         if(list.get(lp) < list.get(rp))
    //         {
    //             lp ++;
    //         }
    //         else {
    //             rp--;
    //         }
    //     }
    //     return maxWater;



    // }
    public static boolean getTarget(ArrayList<Integer> list , int target)
    {
        int lp = 0;
        int rp = list.size() - 1;
        while(lp != rp)
        {
            // case 1
            if(list.get(lp) + list.get(rp)== target)
            {
                return true;

            }
            if(list.get(lp) + list.get(rp) < target)
            {
                lp++;

            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(getTarget(list , 6));
        // for(int i = list.size() -1; i>=0; i--)
        // {
        //     System.out.print(list.get(i) + " ");

        // }
        // System.out.println();
        // int max =Integer.MIN_VALUE;
        // for(int i = 0; i<list.size(); i++)
        // {
        //     max = Math.max(max , list.get(i));
        // }
        // System.out.println("maximum element is =" +max );
    //     Collections.sort(list);
    //     System.out.println(list);
    //     Collections.sort(list, Collections.reverseOrder());
    //     System.out.println(list);
    // }
    }
}
    

