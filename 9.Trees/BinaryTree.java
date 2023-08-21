import java.util.*;

public class BinaryTree {

    public static class Node {
        int value;
        Node Left;
        Node Right;
    }

    public static void main(String[] args) {

        Node n1 = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root Value");

        int value = sc.nextInt();

        Node root = new Node();

        root.value = value;

        Populate(root);

    }

    public static void Fun(int n) {

        System.out.print(n);

    }

    public static void Populate(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Want Left Child for" + root.value);
        boolean isLeft = sc.nextBoolean();

        if (isLeft == true) {
            System.out.println("Enter Left Value for " + root.value);
            int left = sc.nextInt();
            Node LEFT = new Node();
            LEFT.value = left;
            root.Left = LEFT;
            Populate(LEFT);
        }

        System.out.println("Do You Want Right Child for" + root.value);
        boolean isRight = sc.nextBoolean();

        if (isRight == true) {
             Node RIGHT = new Node();
            System.out.println("Enter Right Value for " + root.value);
            RIGHT.value =sc.nextInt();
            root.Right = RIGHT;
            Populate(RIGHT);
        } 

    }

}