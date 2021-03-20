package Stack;

import java.util.Stack;

public class PrefixPostfix {
	
	static boolean isOperator(char c) {
		
		switch(c) {
			
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		default: 
			return false;
		}
		
	}
	
	static String prefixToPostfix(String exp) {
		
		int length = exp.length();
		
		Stack<String> stack = new Stack<>();
		String result = new String("");
		
		for(int i = length - 1; i>= 0 ; i--) {
			char ch = exp.charAt(i);
			
			if(isOperator(ch)) {
				
				String A = stack.pop();
				String B = stack.pop();
				
				if(A == null || B == null) {
					return "Invalid exp";
				}
				
				String temp =  A + B + ch ;
				stack.push(temp);
				
			}else {
				if(Character.isLetter(ch)) {
					stack.push(String.valueOf(ch));
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String exp = "*-A/BC-/AKL";
		
		System.out.println(prefixToPostfix(exp));

	}

}
