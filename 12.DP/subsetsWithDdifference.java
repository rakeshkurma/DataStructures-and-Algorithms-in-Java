public class subsetsWithDdifference {
    public static void main(String[] args){
          int[] arr={1,0,8,5,1,4};

    int sum=0,min=Integer.MAX_VALUE,D=17;

    for(int x:arr)
        sum+=x;

   int[][] dp=new int[arr.length+1][sum+1];

  for(int i=1;i<=sum;i++)
  dp[0][i]=0;

  for(int i=0;i<=arr.length;i++)
  dp[i][0]=1;

   for(int i=1;i<=arr.length;i++){
    for(int j=1;j<=sum;j++){

        if(arr[i-1]>j) dp[i][j]=dp[i-1][j];

        else dp[i][j]= (dp[i-1][j] + dp[i-1][j-arr[i-1]]) ;

        if(i>2 && arr[i-2]==0)
        dp[i][j]++;
    }

   }


   for(int i=0;i<arr.length;i++){
    for(int j=0;j<=sum;j++)
    System.out.print(dp[i][j]+" ");

    System.out.println();
   }

int max=0,n=arr.length;
   for(int i=0;i<=sum/2;i++){
 
    if(dp[n][i]>0 && dp[n][sum-i]>0 && Math.abs(i- (sum-i))==D)
        max=Math.max(max,dp[n][i]);
   }
     
System.out.println(max);
    }
}
