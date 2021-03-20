//package Stack;
//
//public class Stack {
//	
//	Node top;
//	
//	void push(int data) {
//		
//		Node node = new Node(data);
//		
//		if(top == null) {
//			top = node;
//			top.next = null;
//			top.prev = null;
//			return;
//		}
//		
//		top.next = node;
//		node.prev = top;
//		top = top.next;		
//		
//	}
//	
//	int pop() {
//		
//		if(top == null) return -1;
//		
//		Node temp = top;
//		top = top.prev;
//		if(top != null) {			
//			top.next = null;
//		}
//		
//		return temp.data;
//		
//	}
//	
//	void reverse() {
//		
//	}
//	
//	class Node {
//		int data;
//		Node next, prev;
//		
//		Node(int data){
//			this.data = data;
//			next = null;
//			prev = null;
//		}
//	}
//	
//}
