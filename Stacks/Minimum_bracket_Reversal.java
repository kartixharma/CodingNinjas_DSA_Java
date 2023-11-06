import java.util.Stack;
public class Solution {
	public static int countBracketReversals(String input) {
		Stack<Character> stack = new Stack<>();
		int count=0;
		if(input.length()%2==0){
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)=='{'){
					stack.push('{');
			}
			else if(input.charAt(i)=='}'){
				if(stack.isEmpty()){
					stack.push('}');
				}
				else if(stack.peek()=='{'){
					stack.pop();
				}
				else{
					stack.push('}');
				}
			}
		}
		while(!stack.isEmpty()){
			char c1=stack.pop();
			char c2=stack.pop();
			if(c1!=c2){
				count+=2;
			}
			else{
				count++;
			}
		}
		}
		else{
			return -1;
		}
		return count;
	}
}