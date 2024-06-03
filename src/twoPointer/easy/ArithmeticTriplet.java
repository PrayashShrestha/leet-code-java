package twoPointer.easy;

import java.util.HashSet;
import java.util.Set;

// 2367
/* We are using algebraic substitution method here. */
// check a num with one difference and with twice of difference
public class ArithmeticTriplet {
    public static int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> seeNumbers = new HashSet<>();
        int count = 0;

        for(int num: nums){
            if(seeNumbers.contains(num - diff) && seeNumbers.contains(num - 2 * diff)){
                count++;
            }
            seeNumbers.add(num);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;

        System.out.println(arithmeticTriplets(nums, diff));
    }
}
