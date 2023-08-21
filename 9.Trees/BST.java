import java.util.Scanner;

public class BST {

    public class Node {
        int val;
        Node left, right;

        public Node(int value) {
            this.val = value;
        }
    }

    public static void main(String[] args) {
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        Node root = null;

        while (!stop) {
            System.out.println("Enter value to be inserted: ");
            int value = sc.nextInt();
            root = Insert(value, root);

            System.out.print("Want to stop? Enter true or false: ");
            stop = sc.nextBoolean();
        }

        sc.close();

        Display(root);

    }

    public static Node Insert(int val, Node root) {
        if (root == null) {
            BST bst = new BST();
            root = bst.new Node(val);
            return root;
        }

        if (val < root.val)
            root.left = Insert(val, root.left);
        else
            root.right = Insert(val, root.right);

        return root;
    }

    public static void Display(Node rootNode) {
        if (rootNode == null)
            return;

        Display(rootNode.left);
        System.out.print(rootNode.val + "   ");
        Display(rootNode.right);
    }

}
