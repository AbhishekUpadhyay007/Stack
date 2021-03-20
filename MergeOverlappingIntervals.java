package Stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		
		Interval arr[] = new Interval[4];
		
		 	arr[0]=new Interval(6,8); 
	        arr[1]=new Interval(1,9); 
	        arr[2]=new Interval(2,4); 
	        arr[3]=new Interval(4,7); 

		mergeInterval(arr);
		
	}
	
	static void mergeInterval(Interval[] arr) {
		
		Arrays.sort(arr,new Comparator<Interval>(){ 
            public int compare(Interval i1,Interval i2) 
            { 
                return i1.start-i2.start; 
            } 
        }); 
		
		for(Interval i : arr) {
			System.out.println("( Start: "+ i.start + " End: "+ i.end +" )");
		}
		
		Stack<Interval> stack = new Stack<>();
		stack.push(arr[0]);
		
		for(int i = 1 ;i<arr.length;i++) {
			
			Interval top = stack.peek();
			
			if(top.end > arr[i].start) {
				if(top.end <= arr[i].end) {
					top.end = arr[i].end;
					stack.pop();
					stack.push(top);
				}
			}else {
				stack.push(arr[i]);
			}
			
		}
		System.out.println("Intervals are: ");
		while(!stack.isEmpty()) {
			Interval i = stack.pop();
			
			System.out.println("["+i.start+ " , "+i.end+"]");
		}
		
	}
}

class Interval{
	int start, end;
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
