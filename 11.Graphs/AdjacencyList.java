import java.util.*;

public class AdjacencyList {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

     ArrayList<Integer>[] list=new ArrayList[n];

     for(int i=0;i<n;i++)
     list[i]=new ArrayList<>();

     for(int i=0;i<n;i++){
        System.out.print("Enter All Connected nodes and distance");
        list[i].add(sc.nextInt());
     }
     
     

    }
}
