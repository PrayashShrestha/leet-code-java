package twoPointer.medium;

import java.util.Arrays;

// 16
public class ThreeClosestSum {
    // sort the array
    // select i as the iterator and i+1 as start and arr.length as the end
    // set a variable closest sum which sets the closest sum
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            throw new IllegalArgumentException("Input array must have at least 3 numbers.");

        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (Math.abs(sum - target) < Math.abs(closestSum - target))
                    closestSum = sum;

                if (sum < target) start++;

                else if (sum > target) end--;

                else return sum;
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,1,-4};
        int target = 1;

        ThreeClosestSum threeClosestSum = new ThreeClosestSum();
        System.out.println(threeClosestSum.threeSumClosest(arr, target));
    }
}
