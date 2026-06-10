import java.util.*;
class Strings
{
//     public static boolean isPalindrome(String str)
//     {
//         for(int i = 0; i< str.length()/2; i++)
//         {
//             int n = str.length();
//             if(str.charAt(i)!= str.charAt(n-1-i))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
    


    
//     public static void main(String args[])
//     {
//         String str = "tonystark";
//         System.out.println(isPalindrome(str));


//     }

// }
    public static float isShortestpath(String path)

    {
        int x =0;
        int y = 0;
        for(int i = 0; i<path.length(); i++)
        {
            char dir = path.charAt(i);
            if(dir == 'S')
            {
                y--;
                
            }
            else if( dir=='N')
        
            {
                y++;
            }
            else if(dir == 'w')
            {
                x--;
            }
            else
            {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
     }
     public static void main(String args[])
    
     {
        String path = "WWEEENNNSSS";
        System.out.println(isShortestpath(path));

     }
    }
