public class MInimumCoins {

public static void main(String[] args)
{

 int coins[]={3,4,1};
 
 int val=5;

 int db[]=new int[val+1];


 db[0]=0;


 for(int i=1;i<=val;i++)
 {
     db[i]=Integer.MAX_VALUE;

    for(int x:coins)
    {
        if(i>=x)
        db[i]=Math.min(db[i],db[i-x]+1);
    }

 }
 

System.out.print(db[val]);

}

    
}
