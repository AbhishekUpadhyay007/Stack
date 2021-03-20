package Stack;

import java.util.Stack;

public class InfixPostfix {

	static int prec(char c) {
		
		switch(c) {
			
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		default: 
			return -1;
		}
		
	}
	
	static String infixToPostfix(String exp) {
		
		String result = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		
		for(int i=0;i<exp.length();i++) {
			
			char c = exp.charAt(i);
			
			if(Character.isLetter(c)) {
				result += c;
			}else {
				if(c=='(') {
					stack.push(c);
				}else {
					if(c==')') {
						while(!stack.isEmpty() && stack.peek() != '(') {
							result += stack.pop();
						}
						stack.pop();
					}else {
						while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
							result+=stack.pop();
						}
						stack.push(c);
					}
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			
			if(stack.peek() == '(') return "invalid exp";
			
			result += stack.pop();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String exp = "K+L-M*N+(O^P)*W/u/v*T+Q";
		System.out.println(infixToPostfix(exp));
	}

}
