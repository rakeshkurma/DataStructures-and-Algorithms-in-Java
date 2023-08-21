public class minsubset{
    public static void main(String[] args){
        
    int[] arr={1,2,3,4};

    int sum=0,min=Integer.MAX_VALUE;

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

int n=arr.length;

  for(int i=0;i<=sum/2;i++){

    if(dp[n][i]&&dp[n][sum-i]){
        min=Math.min(min,Math.abs((sum-i)-i));
    }

  }

System.out.println(min);

    }

    // public static void DP(int index,int[] arr,boolean[] vis,int sum){
    //      vis[sum]=true;

    //  if(index==arr.length) return ;

    // vis[sum]=true;

    // DP(index+1,arr,vis,sum+arr[index]);
    // DP(index+1,arr,vis,sum); 

    // }

}