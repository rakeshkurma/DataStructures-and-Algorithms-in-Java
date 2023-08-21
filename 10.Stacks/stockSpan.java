
import java.util.*;

public class stockSpan {
    public static void main(String[] args)
    {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;
        int[] index=new int[n];
        Stack<Integer> stack=new Stack<>();

     for(int i=0;i<n;i++)
     {
        int count=1;
        while(stack.isEmpty()==false && arr[i]>arr[stack.peek()])
            count+=index[stack.pop()];
      
        
            stack.push(i);
            index[i]=count;
    
     }   

    for(int x:index)
    System.out.print(x+" ");

    }
}
