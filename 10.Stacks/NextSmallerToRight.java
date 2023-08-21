import java.util.Stack;

public class NextSmallerToRight {
     public static void main(String[] args)
    {
        int[] arr={4,5,2,10,8};

        int n=arr.length-1;
       Stack<Integer> stack=new Stack<>();
     
     for(int i=n;i>=0;i--)
     {
        while(stack.isEmpty()==false && arr[i]<=stack.peek())
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
