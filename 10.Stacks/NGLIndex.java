import java.util.Stack;

public class NGLIndex{
    public static void main(String[] args)
    {
         int[] arr={2,1,5,6,2,3};

       Stack<Integer> stack=new Stack<>();
       int[] index=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
    
            while(stack.isEmpty()==false && arr[i]<arr[stack.peek()])
                 stack.pop();

            if(stack.isEmpty())
            index[i]=-1;
            else
            index[i]=stack.peek();

            stack.push(i);
        }

    for(int x:index)
    System.out.print(x+" ");


    }
}
