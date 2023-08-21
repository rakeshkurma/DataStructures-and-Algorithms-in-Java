
public class MaxCuts {

    public static void main(String[] args) {

        int val1 = 5, a = 1, b =2, c = 3;

        int val = Cut(val1, a, b, c);

        System.out.print(val);

    }

    public static int Cut(int val, int a, int b, int c) {

    
        if (val < 0)
            return Integer.MIN_VALUE;

        if(val==0)
        return 0;

        int lef = 0, righ = 0, top = 0;

        
            lef = 1 + Cut(val - a, a, b, c);
            righ = 1 + Cut(val - b, a, b, c);
            top = 1 + Cut(val - c, a, b, c);

        return Math.max(lef, Math.max(righ, top));

    }

}