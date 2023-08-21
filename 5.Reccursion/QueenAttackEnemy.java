
import java.util.*;
public class QueenAttackEnemy {
    public static int max=0;
    public static void main(String[] args)
    {
 
        int[][] mat =
         {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 2, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 2, 0, 0, 2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        //ArrayList<Integer> Outer[64];
        ArrayList<Integer>[] outer = new ArrayList[64];
        for (int i = 0; i < 64; i++) {
            outer[i] = new ArrayList<Integer>();
        }
     int[] vis=new int[64];
     Arrays.fill(vis,0);
    
  int QueenPos=-1;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                 if(mat[i][j]==1 || mat[i][j]==2 )
                 {
                       if(mat[i][j]==1) QueenPos=(i*8)+j;

                       for(int p=-1;p<=1;p++)
                       {
                        for(int q=-1;q<=1;q++)
                        {
                            if(p==0 && q==0) continue;

                           for(int k=1;k<8;k++)
                           {
                            int row= (k*p);
                            int col=(k*q);
                                    
                          if(row+i>=0 && row+i<8 && col+j>=0 && col+j<8 && mat[row+i][col+j]==2)
                          {
                              outer[(i*8)+j].add( (row+i)*8 + (col+j));
                              break;
                          }  

                        } 

                        }
                       }

                 }

            }
        }
        
        FindMax(QueenPos,outer,vis,0);

        System.out.print(max);
    }

public static void FindMax(int q,ArrayList<Integer>[] outer,int[] vis,int count)
{
    vis[q]=1;

   for(int i=0;i<outer[q].size();i++)
   {
      if(vis[outer[q].get(i)]==0){
        max=Math.max(max,count+1);
        FindMax(outer[q].get(i), outer, vis, count+1);
      }
   }
   vis[q]=0;

}


}
