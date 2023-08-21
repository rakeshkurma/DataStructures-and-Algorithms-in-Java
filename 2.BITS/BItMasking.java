public class BItMasking {
    public static void main(String[] args)
    {
        int num=24;
        int i=4;
//GET SET and Clear Ith Bit

  int mask=1<<(i-1);

  int get =((mask&num)==0?0:1);
  System.out.print("Get:"+get+"  ");
  System.out.print("Set "+ (mask|num)+"  ");

  System.out.print("Clear "+ (~mask & num));


    }
}
