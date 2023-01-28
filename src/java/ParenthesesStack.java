package exercises2;

import java.util.Stack;

public class ParenthesesStack {

	static Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		String s = "asdtrdf{[(adsd())]sds}(x)";
		
		if(s.length()>0)
			System.out.println(balancedParentheses(s));		
	}

	public static boolean balancedParentheses(String s) {
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			// If opening parenthesis, push into stack
			if(c =='(' || c =='[' || c =='{') {
				stack.push(c);
			}
			
			// If closing parenthesis
			if(c ==')' || c ==']' || c =='}') {
				if(stack.isEmpty())
					return false;
				// if no match return false
				if(c ==')' && stack.pop()!='(')
					return false;
				else if(c ==']' && stack.pop()!='[')
					return false;
				else if(c =='}' && stack.pop()!='{')
					return false;
			}
		}
		
		return stack.isEmpty();
	}
}
