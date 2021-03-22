package array;

public class Q16 {

	public static void main(String[] args) {
//Write a program to replace 0‟s with 1‟s. e.g array is [0,1,0,1,0,1,0,1,0,1,0,1,0].
		int[] a= {0,1,0,1,0,1,0,1,0,1};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				a[i]=1;
			}
			else
				a[i]=0;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
