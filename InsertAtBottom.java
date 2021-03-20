package Stack;

public class InsertAtBottom {

	static Node curr;
	
	//Creating an ds for inserting the element at bottom;
	
	public static void main(String[] args) {
		
		InsertAtBottom ds = new InsertAtBottom();
		
		ds.add(20);
		ds.add(30);
		ds.add(10);
		ds.add(40);
		
		System.out.println(ds.bottomElement());
		
	}
	
	static void add(int data) {
		
		Node node = new Node(data);
		
		if(curr == null) {
			curr = node;
			curr.next = null;
			return;
		}
		
		Node temp = node;
		temp.next = curr;
		curr = temp;
		
	}
	
	static int bottomElement() {
		
		if(curr == null) {
			System.out.println("DS is epmty");
			return Integer.MAX_VALUE;
		}
//		System.out.println(curr.data);
		return curr.data;
	}
	
	static void print() {
		
		if(curr == null) {
			System.out.println("DS is empty");
			return;
		}
		
		Node temp = curr;
		
		while(temp.next != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data+" ");
		
	}

}
class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
}
