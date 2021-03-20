package Stack;
import java.util.* ;

public class StackPermutation {

	public static void main(String[] args) {
		
		int input[] = {1,2,3};
		int output[] = {2,1,3};
		
		int n = 3;
		
		boolean result  = checkPermutation(input, output, n); 

		if(result) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	static boolean checkPermutation(int input[], int output[], int n) {
		
		Queue<Integer> ip = new LinkedList<>();
		
		for(int a : input) {
			ip.add(a);
		}
		
		Queue<Integer> op = new LinkedList<>();
		
		for(int a : input) {
			op.add(a);
		}
		
		
		Stack<Integer> stack = new Stack<>();
		
		while(!ip.isEmpty()) {
			
			if(ip.peek() == op.peek()) {
				
				op.poll();
				
				while(!stack.isEmpty()) {
					
					if(op.peek() == stack.peek()) {
						stack.pop();
						op.poll();
					}else {
						break;
					}
					
				}
				
			}else {
				stack.push(ip.poll());
			}
			
		}
				
		return stack.isEmpty() && ip.isEmpty();
	}

}
