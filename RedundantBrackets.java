package Stack;

import java.util.Stack;

public class RedundantBrackets {

	public static void main(String[] args) {
		
		String exp = "(a+(b)/c)";
		
		boolean res = findRedundancy(exp);
		
		if(res) {
			System.out.println("Yes!");
		}else {
			System.out.println("No");
		}

	}
	
	static boolean findRedundancy(String exp) {
		
		Stack<Character> stack = new Stack<>();
		
		char[] arr = exp.toCharArray();
		
		for(char ch : arr) {
			
			if(ch==')') {
				
				char top = stack.pop();
				
				boolean findOp = false;
				
				while(top != '(') {
					
					if(top == '+' || top == '-' ||top == '*' ||top == '/' ) {
						findOp = true;
					}
					
					top = stack.pop();
					
				}
				
				if(!findOp) {
					return true;
				}
				
			}else {
				stack.push(ch);
			}
		}
		
		return false;
	}

}
