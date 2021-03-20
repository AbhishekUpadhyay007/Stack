package Stack;

import java.util.Stack;

public class PrefixInfix {
	

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
	
	static String prefixToInfix(String exp) {
		
		int length = exp.length();
		
		Stack<String> stack = new Stack<>();
		String result = new String("");
		
		for(int i=length-1;i>=0;i--) {
			
			char ch = exp.charAt(i);
			System.out.println(ch);
			
			if(Character.isLetter(ch)) {
				stack.push(String.valueOf(ch));
			}else if(isOperator(ch)) {
				
				String A = stack.pop();
				String B = stack.pop();
				
				String temp = "(" + A + ch + B +")"; 
				stack.push(temp);
			}
			
		}
		
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
//		System.out.println("hei"+result);
		return result;
	}

	public static void main(String[] args) {
		
		String exp = "*-A/BC-/AKL"; 
//		System.out.println(exp);
		System.out.println(prefixToInfix(exp));
		
	}

}
