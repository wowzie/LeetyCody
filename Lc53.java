public class Lc53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2 , 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(maxSubArray(new int[]{-1, -2}));
    }

    public static int maxSubArray(int[] nums) {
        int index = 1;
        int maxSum = nums[0];
        int currSum = nums[0];

        while (index < nums.length) {
            if (currSum < 0) {
                currSum = 0;
            }

            currSum += nums[index];
            maxSum = Math.max(maxSum, currSum);
            index++;
        }

        return maxSum;
    }
}
