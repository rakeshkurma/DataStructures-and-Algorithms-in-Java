public class DiceThrow {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        System.out.print("hhh");
        Subset(nums, "", 4);
    }

    public static void Subset(int[] arr, String res, int target) {
        if (target < 0)
            return;
        if (target == 0) {
            System.out.print("hhh");
            System.out.print(res);
            return;
            
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target)
                Subset(arr, res + arr[i], target-arr[i]);

                // System.out.print("hhh");
        }

    }
}
