package Stack;

import java.util.Scanner;

public class TwoStacks {
	
	static int arr[];
	static int top1, top2;
	
	static void create(int size) {
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}
	
	static void push1(int num) {
		if(top2 - top1 == 1) {
			return;
		}
		top1 = top1 + 1;
		arr[top1] = num;
	}
	
	static void push2(int num) {
		if(top2 - top1 == 1) {
			return;
		}
		top2 = top2 - 1;
		arr[top2] = num;
	}
	
	static int pop1() {
		if(top1 == -1) return 0;
		int n = arr[top1];
		top1 = top1 - 1;
		return n;
	}
	
	static int pop2() {
		
		if(top2 == arr.length) return 0;
		
		int n = arr[top2];
		top2 = top2 + 1;
		return n;
	}
	
	static boolean isEmpty() {
		if(top1 == -1 && top2 == arr.length) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		create(n);
		
		TwoStacks.push1(12);
		TwoStacks.push2(3);
//		TwoStacks.push2(4);
//		TwoStacks.push1(42);
//		TwoStacks.push2(5);
		TwoStacks.push2(78);

		System.out.println("Stack 1:");
//		System.out.print (TwoStacks.pop1()+" ");
		while(top1!=-1) {
			System.out.print (TwoStacks.pop1()+" ");
		}
		System.out.println("\nStack 2:");
		while(top2 != arr.length) {
			System.out.print (TwoStacks.pop2()+" ");
//			System.out.print (TwoStacks.pop2()+" ");
//			System.out.print (TwoStacks.pop2()+" ");
		}
		
	}


}
