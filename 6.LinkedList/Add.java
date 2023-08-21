public class Add {
    public static int carry=0;
    public static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        
        Node head1 = null;
        Node tail = null;

        for (int i = 1; i <=5; i++) {
            Node newNode = new Node();
            newNode.data = 9;

            if (head1 == null) {
                head1 = newNode;
                tail = newNode;
            } 
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

      Node head2 = null;
        Node tail2 = null;

        for (int i = 1; i <=5; i++) {
            Node newNode = new Node();
            newNode.data = 9;

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } 
            else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }


       Node res=Add(head1,head2);
 
       if(carry==1){
          Node newNode = new Node();
          newNode.data=1;
      newNode.next=res;
      res=newNode;
       }

       Print(res);


    }

public static Node Add(Node temp1,Node temp2){
    if(temp1==null) return null;

     Node newNode = new Node();
   
   newNode.next=Add(temp1.next,temp2.next); 
     
   int sum=carry;
   if(temp1!=null) sum+=temp1.data;
   if(temp2!=null) sum+=temp2.data;
   newNode.data=sum%10;
   carry=sum/10;

   return newNode;

}




public static void Print(Node temp)
{
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}


}
