package array;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
	//Write a program to put even and odd elements of array in two separate arrays.
		int[] a= {2,3,4,5,6,7,8,6,4,3,1,2};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				cnt++;
			}
		}
		int[] en =new int[cnt];
		int in=0,ino=0;
		int[] od = new int[a.length-cnt];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				en[in++]=a[i];
			}
			else
			{
				od[ino++]=a[i];
			}
		}
		System.out.println(Arrays.toString(en));
		System.out.println(Arrays.toString(od));
	}
}
