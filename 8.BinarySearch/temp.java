public class temp {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,7,8,10,12,19};
        int index=-1,tar=5;

int start=0,end=arr.length-1;

     while(start<=end)
     {
        int mid=start+(end-start)/2;
        if(arr[mid]==tar)
        {
           index=mid;
           start=mid+1;
        }
        else if(arr[mid]>tar)
        end=mid-1;
        else
        start=mid+1;
     }

     System.out.print(arr[end]);
    } 
}
