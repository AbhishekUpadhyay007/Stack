package Stack;
import java.util.*;

public class MinElement {

	Stack<Integer> s;
	int minEle;
	
	public MinElement() {
	
		s = new Stack<Integer>();
				
	}
	
	void push(int x) {
		
		if(s.isEmpty()) {
			s.push(x);
			minEle = x;
			return;
		}
		
		if(x<minEle) {
			int n = 2 * x - minEle;
			s.push(n);
			minEle = x;
		}else {
			s.push(x);
		}
		
	}
	
	int getMin() {
		if(s.isEmpty()) return Integer.MAX_VALUE;
		return minEle;
	}
	
	int peek() {
		if(s.isEmpty()) return Integer.MAX_VALUE;
		
		int t = s.peek();
		if(t<minEle) {
			return minEle;
		}else {
			return t;
		}
	}
	
	void pop() {
		
		if(s.isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		
		int t = s.pop();
		
		if(t<minEle) {
			System.out.println(minEle); 
			int n = 2 * minEle - t;
			minEle = n;
		}else {
			System.out.println(t);
		}
		
	}
	
	public static void main(String[] args) {
		
		MinElement stack = new MinElement();
		
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(-1);
		stack.push(1);
		
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
		System.out.println("Min element in stack is: "+stack.getMin());
		System.out.println(stack.peek());
			
	}

}
