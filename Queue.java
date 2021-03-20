//package Stack;
//
//public class Queue {
//	
//	Node front, rear;
//	
//	void enqueue(int data) {
//		
//		Node node = new Node(data);
//		
//		if(front == null) {
//			front = rear = node;
//			return;
//		}
//		
//		rear.next = node;
//		node.prev = rear;
//		rear = rear.next;
//		
//	}
//	
//	int dequeue() {
//		
//		if(front == null) return -1;
//		
//		Node temp = front;
//		if(front == rear) {
//			front = rear = null;
//		}else {
//			front = front.next;
//			front.prev = null;			
//		}
//		
//		return temp.data;
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
//}
