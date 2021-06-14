package Leetcode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution_2 {
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int length = nums.length;
        while(i < length-1){
            if(nums[i] == nums[i+1]){
                for(int j = i+1; j < length; j++){
                    if(j == length-1){
                        continue;
                    } else {
                        nums[j] = nums[j + 1];
                    }
                }
                length--;
                i++;
                continue;
            }

        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for(int i=0;i<len;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
