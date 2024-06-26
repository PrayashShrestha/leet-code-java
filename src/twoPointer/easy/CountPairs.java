package twoPointer.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2824
public class CountPairs {
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size() - 1; i++){
            for(int j = i+1; j < nums.size(); j++){
                    if((nums.get(i) + nums.get(j)) < target){
                        count++;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        int target = 2;
        System.out.println(countPairs(nums, target));
    }
}
