

import java.util.*;
import java.util.Stack;
public class NextGreaterToRight{
    public static void main(String[] args)
    {
        int arr[]={1,3,0,0,1,2,4};
     int n=arr.length-1;

     Stack<Integer> stack=new Stack<>();
     
     for(int i=n;i>=0;i--)
     {
        while(stack.isEmpty()==false && arr[i]>=stack.peek())
        stack.pop();

        int  temp=arr[i];
        if(stack.isEmpty()==false)   arr[i]=stack.peek();
        else arr[i]=-1;

        stack.push(temp);
     }


     for(int x:arr)
     System.out.print(x+" ");

        
    } 
}