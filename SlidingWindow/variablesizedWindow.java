public class variablesizedWindow{
    public static void main(String[] args)
    {
        int[] arr={4,1,1,1,2,3,5};
      int start=0,end=0,max=0,k=5,sum=0,count=0;


         while(end<arr.length)
         {

       if(sum==k)
       {
          max=Math.max(max,end-start);
          sum+=arr[end++];
          count++;
       }

      else if(sum<k)
      {
           sum+=arr[end];
           end++;
      }
     
      else
      {
         sum-=arr[start];
         start++;
      }
         }
    
System.out.print(count);

    }
}