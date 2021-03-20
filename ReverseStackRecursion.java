package Stack;

import java.util.Stack;

public class ReverseStackRecursion {
	
	static Stack<Integer> stack = new Stack<>();
	
	static void insertAtBottom(int a) {
		if(stack.isEmpty()) {
			stack.push(a);
		}else {
			int curr = stack.pop();
			insertAtBottom(a);
			stack.push(curr);
		}
	}

	static void reverse() {
		
		if(stack.size() > 0) {
			int a = stack.pop();			
			reverse();
			insertAtBottom(a);
		}
		
	}
	

	public static void main(String[] args) {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Original stack"+stack);
		reverse();
		System.out.println("Reverse stack"+stack);
		
	}

}
