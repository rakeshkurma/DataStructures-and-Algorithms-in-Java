public class temp {
    public static void main(){

        int[] arr={1,2,3};

  int index=0,max=arr[0],firstMax=0,secondMax=0;

  for(int i=1;i<arr.length;i++)
  {
    if(arr[i]>=arr[index])
    index=i;
  }

  arr[index]=Integer.MIN_VALUE;
  
  index=0;
   for(int i=1;i<arr.length;i++)
  {
    if(arr[i]>=arr[index])
    index=i;
  }

    }
}
