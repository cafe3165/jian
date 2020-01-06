package leetcode;

import java.util.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class T16_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int L = i + 1, R = nums.length - 1;

            while (L < R) {
                int cur = nums[i] + nums[L] + nums[R];

                if (Math.abs(cur - target) < Math.abs(ans-target)){
                    ans=cur;
                }
                if(cur>target){
                    R--;
                }else if(cur<target){
                    L++;
                }else{
                    return ans;
                }
            }
        }


        return ans;

    }

    public static void main(String[] args) {
        T16_threeSumClosest t = new T16_threeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        t.threeSumClosest(nums, target);
    }
}
