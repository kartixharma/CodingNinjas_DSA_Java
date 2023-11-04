import java.util.Stack;
public class Solution {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)=='('){
                stack.push('(');
            }
            else if(expression.charAt(i)==')'){
                if(stack.isEmpty()){
                    flag=false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            flag=false;
        }
        return flag;
        }         
    }