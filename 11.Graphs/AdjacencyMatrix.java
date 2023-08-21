import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class AdjacencyMatrix{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Number Of Nodes: ");
         int n=sc.nextInt();

      int[][] arr=new int[n][n];
      
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("Enter "+ i +" "+ j +" 5Distance: ");
            arr[i][j]=sc.nextInt();
        }
      }

    for(int[] x:arr){
        for(int i:x)
        System.out.print(i+" ");
      
    System.out.println();
    }

    }
}