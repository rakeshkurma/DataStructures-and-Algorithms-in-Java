public class MissingNumber {
    
    public static void main(String[] args)
    {

  int arr[]={1,2,3,4,8,5,6};

int res=arr[0];
  for(int i=1;i<arr.length;i++)
    res=(res^i^arr[i]);
  
    res^=arr.length;
  

System.out.print(res);

    }
}
