package array;

public class Q17 {

	public static void main(String[] args) {
		//Write a program to separate even and odd numbers of an given array of integers.
		//Put all even numbers first, and then odd numbers.
		int[] a= {2,3,4,1,31,6,78,9,1,23,7,11,15,64};
		int ind =0;
		int[] t =new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				int temp = a[i];
				a[i]=a[ind];
				a[ind++]=temp;
			}	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
