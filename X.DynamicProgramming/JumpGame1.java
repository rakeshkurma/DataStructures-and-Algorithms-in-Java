public class JumpGame1 {
    
public static void main(String[] args)
{
   
    int[] arr={0,10,0,0,3,1,2};
    //check wheather we can Reach End or not

    boolean Value=Isjump(arr);

    System.out.print(Value);
}


  public static boolean Isjump(int[] arr)
  {

     int maxReach=0;

     for(int i=0;i<arr.length;i++)
     {

     if(i>maxReach)
     return false;

     if(maxReach==arr.length) return true;

     maxReach=Math.max(maxReach,arr[i]+i);

     }

    return true;
  }


}
