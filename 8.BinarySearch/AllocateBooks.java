public class AllocateBooks {
    public static void main(String[] args)
    {
        int[] arr={10,20,30};

        int start=Integer.MIN_VALUE,end=0,k=1,count=0;

        for(int x:arr)
        {
               start=Math.max(start,x);
               end+=x;
        }

        int temp=0;
        while(start<=end)
        {

            int mid=(start+end)/2;
            temp=0; count=0;

        for(int x:arr)
        {
            if(temp+x>mid)
            {
                temp=x;
                count++;
            }
            else temp+=x;
        }

        if(count<=k)
        end=mid-1;
        else
        start=mid+1;

        }

        System.out.println(start);
    }
}
