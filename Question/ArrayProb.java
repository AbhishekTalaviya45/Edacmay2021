import java.util.*;
public class ArrayProb {
	static int count(int[] arr) {
		ArrayList arrr = new ArrayList();
		ArrayList ar = new ArrayList();
		if(arrr.size() == 0)
			arrr.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(i==arr.length-1) {
				if(arr[i]>arr[i-1])
					arrr.add(arr[i]);
			}
			else if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]) {
				arrr.add(arr[i]);
			}else {
				ar.add(arr[i]);
			}
		}
		
		System.out.print("The shortest subarray we can remove is : ");
		for(Object a:ar) {
			System.out.print(a + " ");
		}
		System.out.println();
		return arrr.size();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,10,4,3,2,5};
		int s = count(arr);
		
		int c = arr.length-s;
		System.out.println("Length of the shortest subarray to remove : "+ c);
	}

}
