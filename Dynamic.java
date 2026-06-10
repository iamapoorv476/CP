import java.util.HashSet;

public class Dynamic {
    public static int catalantab(int n){
        int dp[] = new int[n+1];
        dp[0] =1;
        dp[1] =1;
        for(int i =2; i<=n; i++){
            for(int j =0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    // public static int LCS(int arr1[], int arr2[]){
    //     int n = arr1.length;
    //     int m = arr2.length;
    //     int dp[][] = new int[n+1][m+1];
    //     for(int i = 0; i<n+1; i++){
    //         dp[i][0] =0;
    //     }
    //         for(int j=0;j<m+1;j++){
    //             dp[0][j] =0;

    //         }
    //         for(int i =1; i<n+1; i++){
    //             for(int j =1; j<m+1;j++){
    //                 if(arr1[i-1]==arr2[j-1]){
    //                     dp[i][j] = dp[i-1][j-1] + 1;
    //                 }
    //                 else{
    //                     int ans1 = dp[i-1][j];
    //                     int ans2 = dp[i][j-1];
    //                     dp[i][j] = Math.max(ans1,ans2);
    //                 }
    //             }
    //         }
    //         return dp[n][m];
        



    // }
    // public static int lis(int arr1[]){
    //     HashSet <Integer> set = new HashSet<>();
    //     for(int i=0; i<arr1.length; i++){
    //         set.add(arr1[i]);
    //     }
    //     int arr2[] = new int[set.size()];
    //     int i=0;
    //     for (int num : set) {
    //         arr2[i] = num;
    //         i++;
            
    //     }
    //     Arrays.sort(arr2);
    //     LCS(arr1,arr2);
    // }
    // public static int LCSTabulation(String str1, String str2){
    //     int n = str1.length();
    //     int m = str2.length();
    //     int dp[][] = new int[n+1][m+1];
    //     for(int i = 0; i<n+1; i++){
    //         for(int j=0; j<m+1;j++){
    //             if(i==0||j==0){
    //                 dp[i][j]=0;
    //             }
    //         }
    //     } 
    //     for(int i=1; i<n+1;i++){
    //         for(int j =1;j<m+1;j++){
    //             if(str1.charAt(i-1)== str2.charAt(j-1)){
    //                 dp[i][j] = dp[i-1][j-1] +1;
    //             }
    //             else{
    //                 int ans1 = dp[i-1][j];
    //                 int ans2 = dp[i][j-1];
    //                 dp[i][j] = Math.max(ans1, ans2);
    //             }
    //         }
    //     }
    //     return dp[n][m];

    // }

   
    // public static boolean targetSumSubset(int arr[], int sum ){
    //     int n = arr.length;
    //     boolean dp[][] = new boolean[n+1][sum+1];
    //     for(int i=0;i<n+1;i++){
    //         dp[i][0]= true;
    //     }
    //     for(int i =1;i<n+1;i++){
    //         for(int j=1;j<sum+1; j++){
    //             int v= arr[i-1];
    //             if(v<=j&&dp[i-1][j-v]== true){
    //                 dp[i][j]= true;
    //             }
    //             else if(dp[i-1][j]== true){
    //                 dp[i][j]= true;
    //             }
    //         }
    //     }
    //     return dp[n][sum];
    // }
    // public static void print(boolean dp[][]){
    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<dp[0].length;j++){
    //             System.out.print(dp[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    // }

//     public static int Knapsack(int val[] ,int wt[],int W, int n , int dp[][]){
//         if(W==0|| n==0){
//             return 0;
//         }
//     if(dp[n][W]!=-1)
//     {
//         return dp[n][W];

//     }
//     if(wt[n-1]<=W){
//         // include
//         int ans1 = val[n-1]+Knapsack(val, wt, W-wt[n-1], n-1, dp);
//         //exclude
//         int ans2 = Knapsack(val, wt, W, n-1, dp);
//         dp[n][W] = Math.max(ans1, ans2);
//         return dp[n][W];
//     }
//     else{
//         dp[n][W] =Knapsack(val, wt, W, n-1, dp);
//         return dp[n][W];
//     }
// }

    //     if(wt[n-1]<=W){
    //         int ans1 = val[n-1]+Knapsack(val, wt, W-wt[n-1], n-1);
    //         int ans2 = Knapsack(val, wt, W, n-1);
    //         return Math.max(ans1,ans2);
    //     }
    //     else{
    //         return Knapsack(val, wt, W, n-1);
    //     }
    // }
    // public static int fib(int n, int f[]){
    //     if(n==0|| n==1){
    //         return n;
    //     }
    //     if(f[n]!=0){
    //         return f[n];
    //     }
    //     f[n] = fib(n-1,f) + fib(n-2,f);
    //     return f[n];
    // }
    public static void main(String args[]){
        System.out.println(catalantab(4));
        
        // int arr[] = {3,5,8,1,10,45,67,89};
        // System.out.println(lis(arr));
        // String str1 = "abcde";
        // String str2 ="ace";
        // System.out.println(LCSTabulation(str1, str2));
        // System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        // int arr[] ={4,2,7,1,3};
        // int sum=6;
        // System.out.println(targetSumSubset(arr, sum));
        // int n=6;
        // int f[]= new int[n+1];
        // System.out.println(fib(n,f));
        // int val[] ={15,14,10,45,30};
        // int wt[]={2,5,1,3,4};
        // int W = 7;
        // // System.out.println(Knapsack(val, wt, W, val.length));
        // int dp[][] = new int[val.length+1][W+1];
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // System.out.println(Knapsack(val, wt, W, val.length, dp));
    }
    
}
