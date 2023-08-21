public class countSubsetWithSumK {
    public static void main(String[] args){
        int[] arr={1,0,8,5,1,4};

    int sum=0,k=17;

    for(int x:arr)
        sum+=x;

        int target=((k+sum)/2);
        if((k+sum)%2==1) System.out.print("Katham");

   int[][] dp=new int[arr.length+1][target+1];

  for(int i=1;i<=target;i++)
  dp[0][i]=0;

  dp[0][0]=1;

   for(int i=1;i<=arr.length;i++){
    for(int j=0;j<=target;j++){

        if(arr[i-1]>j) dp[i][j]=dp[i-1][j];

        else 
           dp[i][j]=dp[i-1][j] + dp[i-1][j-arr[i-1]];
    }
   }

System.out.print(dp[arr.length][target]);

    }
}
