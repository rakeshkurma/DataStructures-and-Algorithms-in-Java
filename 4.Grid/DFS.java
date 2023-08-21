public class DFS{
    public static void main(String[] args)
    {
        int[][] arr={

     {1,2,3,4,5},
     {6,7,8,9,10},
     {11,12,13,14,15},
        {16,17,18,19,20}
        };


       Fun(0,0,arr); 
    }
public static void Fun(int row,int col,int[][] arr)
{

    if(row == arr.length || col == arr[0].length || row < 0 || col < 0 || arr[row][col]==-1)
    return;

    System.out.print(arr[row][col]+" ");
    arr[row][col]=-1;

    Fun(row-1,col,arr);
    Fun(row+1,col,arr);
    Fun(row,col-1,arr);
    Fun(row,col+1,arr);

}

}