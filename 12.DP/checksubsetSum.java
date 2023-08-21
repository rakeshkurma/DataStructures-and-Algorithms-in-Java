public class checksubsetSum {
    public static void main(String[] args){
        int[] arr={1,2,3,4};

    int sum=0,k=4;

    for(int x:arr)
        sum+=x;

   boolean[][] dp=new boolean[arr.length+1][sum+1];

  for(int i=1;i<=sum;i++)
  dp[0][i]=false;

  for(int i=0;i<=arr.length;i++)
  dp[i][0]=true;

   for(int i=1;i<=arr.length;i++){
    for(int j=1;j<=sum;j++){

        if(arr[i-1]>j) dp[i][j]=dp[i-1][j];


        else dp[i][j]= (dp[i-1][j] | dp[i-1][j-arr[i-1]]) ;
    }
   }


   System.out.print(dp[arr.length][k]);

    }
}
