

import java.util.*;


class ArrayOperation {
    public static void main(String args[] ) {
    
        Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int q=s.nextInt();
ArrayList<Integer> arr=new ArrayList<>();
  
int sum=0;
  for(int i=0;i<n;i++)
  {
    int value=s.nextInt();
    arr.add(value);
   sum+=value;
  }

int j=0;
  for(int k=0;k<q;k++)
  {
  int val=s.nextInt();
   while(j!=val)
   {
     sum=GetSum(arr,sum);
     j++;
   }
System.out.println(sum);
  }

    }

public static int GetSum(ArrayList<Integer> arr,int sum)
{
  int minIndex=0,maxIndex=0;

  for(int i=0;i<arr.size();i++)
  {
    if(arr.get(i)<minIndex)
    minIndex=i;

   if(arr.get(i)>maxIndex)
   maxIndex=i; 
  }

int diff=arr.get(maxIndex)-arr.get(minIndex);
 sum-=(arr.get(maxIndex)+arr.get(minIndex)-diff );
  arr.remove(maxIndex);
  arr.remove(minIndex);
  arr.add(diff);
  return sum;
}


}
