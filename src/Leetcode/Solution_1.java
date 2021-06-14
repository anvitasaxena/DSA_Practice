package Leetcode;
// https://leetcode.com/problems/length-of-last-word/
public class Solution_1 {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int prevLength = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                prevLength = length!=0 ? length : prevLength;
                length = 0;
            } else{
                length++;
            }
            if(length!=0 && i == s.length()-1){
                prevLength = length;
            }
        }
        return prevLength;
    }
//    String[] res = s.split(" ");
//        return (res.length == 0 ? 0 : res[res.length - 1].length());

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
