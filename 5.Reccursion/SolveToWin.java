import java.util.*;
public class SolveToWin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int q=sc.nextInt();

       int[] arr=new int[N];
       
      for(int i=0;i<N;i++)
         arr[i]=0;
  

        for(int i=0;i<q;i++)
        {
           int start=sc.nextInt();
           int end=sc.nextInt();
           int value=sc.nextInt();

          for(int j=start;j<=end;j++)
          arr[j-1]+=value; 

        }
          int max=Integer.MIN_VALUE;

          for(int k=0;k<N;k++)
          max=Math.max(max,arr[k]);

        System.out.println(max);

    }
}
