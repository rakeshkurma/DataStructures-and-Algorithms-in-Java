import java.util.Scanner;

public class BinaryToGray {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

       String temp="011";

StringBuilder Gray = new StringBuilder();

Gray.append(temp.charAt(0));
      
for(int i=1;i<temp.length();i++)
{

  int curr=Character.getNumericValue(temp.charAt(i));
  int prev=Character.getNumericValue((temp.charAt(i-1)));


  int res= (curr ^ prev);
  Gray.append(res);

}

System.out.println(Gray);


    }
}
