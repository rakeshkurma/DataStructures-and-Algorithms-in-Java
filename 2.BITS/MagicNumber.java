public class MagicNumber{
    public static void main(String[] args)
    {
            int n=555,val=5,sum=0;
             while(n>0)
             {
                if((n&1)==1)
                  sum+=val;

                  n=(n>>1);
                  val*=5;
             }
System.out.print(sum);

    }
}