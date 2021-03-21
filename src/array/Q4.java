package array;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
	//Write a program to copy an array by iterating the array.
		int[] a= {1,2,3,4,5,6,7};
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]= a[i];
			
		}
		System.out.print(Arrays.toString(b));
	}

}
