public class RepeatedandDuplicated{
    public static void main(String[] args)
    {

 int[] nums={1,4,2,2};

        int n = nums.length;
        for (int i = 0; i < n;) {
            if (nums[i] != i + 1 && nums[i] != n && nums[nums[i] - 1] != nums[i])
                Swap(nums, i, nums[i]);
            else
                i++;

                System.out.println(i);
        }

        System.out.println("hello");
    }

    public static void Swap(int[] arr, int index, int value) {
        int temp = arr[value - 1];
        arr[value - 1] = arr[index];
        arr[index] = temp;
    }

}