public class searchInSortedArray {
    public static void main(String[] args)
    {
        int arr[]={10,20,40,60,50,8};
       int start=0,end=arr.length-1,tar=20;
       
       while(start<=end)
       {

    int mid=start+(end-start)/2;

     if(arr[mid]==tar) {
        System.out.println(mid);
        break;
     }


       if(arr[start]<arr[mid] && tar > arr[start] && tar <arr[mid])
           end=mid-1;
      else if (arr[mid]<tar && arr[end]>tar)
      {

      }
      start=mid+1;
       
       }
// System.out.println("-1")
    }
}
