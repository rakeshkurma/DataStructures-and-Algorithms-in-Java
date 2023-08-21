import java.util.Scanner;

public class LookUpTable {
    public static void main(String[] args)
    {

      int[] arr=new int[256];

      arr[0]=0;
      for(int i=1;i<256;i++)
        arr[i]=(i&1)+arr[i/2];
           
      Scanner sc=new Scanner(System.in);

      int x=sc.nextInt();

      System.out.print(arr[x]);

    }
}
