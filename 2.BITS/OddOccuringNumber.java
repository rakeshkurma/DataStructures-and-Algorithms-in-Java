public class OddOccuringNumber {
    

public static void main(String[] args)
{


    int arr[]={4,1,4,4,4,5,5};

// Using property of XOR we perform X or on every element 
// Even Occured will cancel out itself .Odd will be remained

int sum=0;
for(int i=0;i<7;i++)
   sum^=arr[i];


   System.out.print(sum);



}

}
