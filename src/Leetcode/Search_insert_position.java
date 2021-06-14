package Leetcode;

public class Search_insert_position {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        if(target < nums[0]){
            return 0;
        }
        if(target > nums[nums.length-1]){
            return nums.length;
        }

        while(start <= end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                if(nums[mid+1] >  target){
                    return mid+1;
                }
                start = mid + 1;
            }
            if(nums[mid] > target){
                if(target > nums[mid-1]){
                    return mid;
                }
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        System.out.println(searchInsert(input, 2));
    }
}
