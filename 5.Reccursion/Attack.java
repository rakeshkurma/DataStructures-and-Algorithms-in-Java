public class Attack {
    public static int maxCount=0;
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 2, 0, 0, 2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };

        boolean[][] vis = new boolean[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                vis[i][j] = false;

FindMax(3, 3, mat, 0, vis);
System.out.println(maxCount);
    }

    public static void FindMax(int row, int col, int[][] mat, int count, boolean[][] vis) {

        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || vis[row][col] == true) {
            System.out.print("Hello");
            maxCount=Math.max(maxCount,count);
            return;
        }


        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0)
                    continue;
 

                    while(row>=0 && col>=0 && row<mat.length && col<mat.length)
                    {
                      System.out.print("Hello");   
                        if(mat[row][col]==1)
                        {
                            vis[row][col] = true;
                          FindMax(row + i, col + j, mat, count+1, vis);
                          vis[row][col]=false;
                        }
                        else{
                            row=row+i;
                            col=col+j;
                        }
                        
                    }

                
            }
        }
    }
}
