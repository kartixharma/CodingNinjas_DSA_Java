import java.util.Stack;
public class Solution {
	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> stack = new Stack<>();
		boolean flag=false;
		for(int i=0; i<expression.length(); i++){
			if(expression.charAt(i)=='('){
				stack.push('(');
			}
			else if(expression.charAt(i)==')'){
				int count=0;
				int size=stack.size();
				while(stack.peek()!='('){
						stack.pop();
						count++;
					}
					stack.pop();
					if(count==1 || count==0){
						flag=true;
					}
			}
			else{
				stack.push(expression.charAt(i));
			}
		}
		return flag;
	}
}