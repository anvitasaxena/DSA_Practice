package Leetcode;

import java.util.Stack;

public class Increment_by_one {
     static  public int[] plusOne(int[] digits) {

            if(digits[digits.length-1] < 9){
                digits[digits.length-1]++;
                return digits;
            }
            else{
                int position = -1;
                for(int i = 0;i< digits.length; i++){
                    if(digits[i] < 9) {
                        position = i;
                    }
                }
                if(position == -1){
                    int[] ans = new int[digits.length+1];
                    ans[0] = 1;
                    for(int i = 1; i< ans.length;i++){
                        ans[i] = 0;
                    }
                    return ans;
                }
                else {
                    for (int a = position + 1; a < digits.length; a++) {
                        digits[a] = 0;
                    }
                    digits[position]++;
                    return digits;
                }

            }
        }

    public static void main(String[] args) {

            int[] digits = {8,9,9,9};
            int[] ans = plusOne(digits);
            for (int an : ans) {
                System.out.println(an);
            }

    }
}
