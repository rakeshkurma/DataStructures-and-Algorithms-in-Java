public class MaxSubArray {
    
public static void main(String[] args)
{

    int arr[]={5,3,10,20};
    System.out.print(Max(arr.length-1,arr));

}

public static int Max(int index,int[] arr)
{

if(index==0) return 0;



int include=0,Not=0;

  if(arr[index]%arr[index-1]==0) include+= 1+Max(index-1,arr);
  

   Not+=Max(index-1,arr);


   return Math.max(include,Not);

}

}
