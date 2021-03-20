package Stack;

public class KStack {

	int arr[], top[], next[];
	
	int n,k;
	int free;
	
	KStack(int n, int k){
		arr = new int[n];
		top = new int[k];
		next = new int [n];
		
		for(int i = 0; i<k;i++) {
			top[i] = -1;
		}
		
		free = 0;
		
		for(int i=0; i<n-1;i++) {
			next[i] = i + 1;
		}
		
		next[n-1] = -1;
	}
	
	void push(int data, int sn) {
		
		if(free == -1) {
			System.out.println("Stack overflow"); return;
		}
				
		int i = free;
		
		free = next[i];
		next[i] = top[sn];
		top[sn] = i;
		
		arr[i] = data;
		
	}
	
	int pop(int sn) {
		
		if(top[sn] == -1) {
			System.out.println("Stack is empty");
			return Integer.MAX_VALUE;
		}
		
		int i = top[sn];
//		free = i;
		top[sn] = next[i];
		next[i] = free;
		free = i;
		
//		System.out.println("Free at: "+free);
		
		return arr[i];
		
	}
	
	public static void main(String[] args) {
		
		KStack ks = new KStack(8,3);
		
		ks.push(15, 2); 
        ks.push(45, 2); 
  
        // Let us put some items in stack number 1 
        ks.push(17, 1); 
        ks.push(49, 1); 
        ks.push(39, 1); 
  
        // Let us put some items in stack number 0 
        ks.push(11, 0); 
        ks.push(9, 0); 
        ks.push(7, 0); 
        
        System.out.println("Popped element from stack 2 is " + ks.pop(2)); 
        System.out.println("Popped element from stack 1 is " + ks.pop(1)); 
        System.out.println("Popped element from stack 0 is " + ks.pop(0)); 
	}

}
