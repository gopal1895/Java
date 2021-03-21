package array;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
//Write a program to remove the duplicate elements of a given array and return the new length of the array.
		int[] a = {3,2,3,1,2,3,1,2,5,7,1,2,3,8,9,8,5,6};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					cnt++;
					a[i]='.';
					i++;
					
				}
			}
		}
		int[] na = new int[a.length-cnt];
		int ind =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!='.')
			{
				na[ind++]=a[i];
			}
		}
		System.out.println("Old Array Length "+a.length);
		System.out.println("New Array Is: "+Arrays.toString(na));
		System.out.println("New Array Length: "+na.length);
	}

}
