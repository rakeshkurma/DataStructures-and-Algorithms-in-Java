
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
    public static void main(String[] args)
    {
        int[][] arr={

     {1,2,3,4,5},
     {6,7,8,9,10},
     {11,12,13,14,15},
        {16,17,18,19,20}
        };
     
 int[] pair=new int[2];

 int m=arr.length;
 int n=arr[0].length;

 boolean[][] visited=new boolean[m][n]; 

 for(int i=0;i<m;i++)
 Arrays.fill(visited[i],false);

Queue<int[]> q= new LinkedList<>();
 pair[0]=0;
 pair[1]=0;

q.offer(pair);
visited[0][0]=true;

       
while(!q.isEmpty()){

   pair=q.poll();

int row=pair[0];
int col=pair[1];

System.out.print(arr[row][col]+" ");

if(row > 0 && !visited[row-1][col]) {
    pair[0]=row-1;
    pair[1]=col;
    q.offer(pair);
    visited[row-1][col]=true;
}


if(row < arr.length-1 && !visited[row+1][col])
{
    pair[0]=row+1;
    pair[1]=col;
    q.offer(pair);
  visited[row+1][col]=true;
}

if(col>0 && !visited[row][col-1])
{
    pair[0]=row;
    pair[1]=col-1;
    q.offer(pair);
    visited[row][col-1]=true;
}

if(col < arr[0].length-1 && !visited[row][col+1])
{
    pair[0]=row;
    pair[1]=col+1;
    q.offer(pair);
    visited[row][col+1]=true;
}


}


    }

}