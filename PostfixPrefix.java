package Stack;

import java.util.Stack;

public class PostfixPrefix {
	
	static boolean isOperator(char ch) {
		switch(ch) {
		
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
	
	static String postfixToPrefix(String exp) {
		
		int length = exp.length();
		Stack<String> stack = new Stack<>();
		String result = new String();
		
		for(int i = 0;i<length;i++) {
			
			char ch = exp.charAt(i);
			
			if(isOperator(ch)) {
				
				String A = stack.pop();
				String B = stack.pop();
				
				String temp = ch + B + A;
				
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

	static String postfixToInfix(String exp) {
		
		int length = exp.length();
		Stack<String> stack = new Stack<>();
		String result = new String();
		
		for(int i = 0;i<length;i++) {
			
			char ch = exp.charAt(i);
			
			if(isOperator(ch)) {
				
				String A = stack.pop();
				String B = stack.pop();
				
				String temp = "("+ B + ch + A +")";
				
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
		
		String exp = "ab*c+" ;
		
		System.out.println(postfixToInfix(exp));
			
	}

}
