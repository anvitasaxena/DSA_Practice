package Leetcode;
import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/
public class Solution {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        if (s.length()==0){
            return true;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(stack.peek()=='(')
                    stack.pop();
            }
            if(s.charAt(i)==']'){
                if(stack.peek()=='[')
                    stack.pop();
            }
            if(s.charAt(i)=='}'){
                if(stack.peek()=='{')
                    stack.pop();
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}

