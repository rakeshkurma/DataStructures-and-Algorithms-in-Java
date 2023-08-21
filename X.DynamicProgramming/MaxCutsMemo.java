
public class MaxCutsMemo{

    public static void main(String[] args) {

        int val1 = 5, a = 1, b = 2, c = 3;

 int arr[]=new int[val1+1];
arr[0]=0;


for(int i=1;i<=val1;i++)
{

 arr[i]=-1;

 if(i>=a)  arr[i]=Math.max(arr[i-a]+1,arr[i]); 

 if(i>=b) arr[i]=Math.max(arr[i-b]+1,arr[i]);

 if(i>=c) arr[i]=Math.max(arr[i-c]+1,arr[i]);


}

System.out.print(arr[val1]);


    }

    
}