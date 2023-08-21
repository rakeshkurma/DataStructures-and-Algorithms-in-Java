public class squareRoot{
    public static void main(String[] args)
    {
        int n=26;

int start=1,end=n/2,index=0;


              while(start<=end)
              {
                int mid=start+(end-start)/2;

            if(mid*mid>=n) {
                index=mid;
                end=mid-1;
            }
            else
            start=mid+1;

              }
 System.out.println(index);

    }
}