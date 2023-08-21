import java.util.*;
public class minDist {
    public static void main(String[] args)
    {

    int[][] arr=new int[5][5];

    for(int i=0;i<5;i++)
    Arrays.fill(arr[i],Integer.MAX_VALUE);

   arr[2][1]=0;

   ArrayList<Integer> list=new ArrayList<>(2);
   Queue<ArrayList<Integer>> q = new LinkedList<>();
    
   System.out.println(list.size());
    } 
}
