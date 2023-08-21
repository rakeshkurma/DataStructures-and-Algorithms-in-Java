
import java.util.*;

public class subsequence {
    public static void main(String[] args) {

        System.out.println(Subseq("ABC", ""));
    }

    public static ArrayList<String> Subseq(String p, String Up) {

        if (p.isEmpty()) {
            ArrayList<String> Inner = new ArrayList<>();
            Inner.add(Up);
            return Inner;
        }

        char ch = p.charAt(0);

        ArrayList<String> Left = Subseq(p.substring(1), Up + ch);
       ArrayList<String> Right = Subseq(p.substring(1), Up);
        Left.addAll(Right);
        return Left;
    }
}