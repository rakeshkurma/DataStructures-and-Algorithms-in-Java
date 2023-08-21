import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args)

    {
        int arr[]={1,3,0,0,1,2,4};
        int n=arr.length;
       Stack<Integer> stack=new Stack<>();
     
     for(int i=0;i<n;i++)
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
