public class Leader {
 
    public static void main(String[] args)
    {
        int n=5;

int[] arr={5,4,5,3,2};
int[] queries={4,5,1,2,3};

int[] res=new int[n];
int[] temp=new int[n];


int max=0,freq=0;
for(int i=n-1;i>=0;i--)
{
   if(arr[i]>max)
   {
    max=arr[i];
    freq=1;
   } 
   else if(arr[i]==max)
    freq++;
    res[i]=freq;
}

for(int i=0;i<n;i++)
    temp[i]=res[queries[i]-1];


for(int i=0;i<n;i++)
System.out.print(temp[i]+" ");

    } 
}
