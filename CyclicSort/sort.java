public class sort {
    public static void main(String[] args){


        int[] arr={1,3,89,7,12,18,19,65,44,11,94};
        int Oddcount=0;

        for(int X:arr)
        {
            if((X&1)==1) Oddcount++;
        }

for(int i=arr.length-1;i>=0 && Oddcount>=0;)
{
    if((arr[i]&1) == 0)
    {
         Swap(arr,i,Oddcount);
         Oddcount--;
    }
   
    else
    i--;
}

 Print(arr);

    }

public static void Swap(int[] arr,int i,int j){
    int x=arr[i];
    arr[i]=arr[j];
    arr[j]=x;
}

public static void Print(int[] arr){

    for(int x:arr)
    System.out.print(x+" ");
}

}
