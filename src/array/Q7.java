package array;

public class Q7 {

	public static void main(String[] args) {
		//Write a program sort array elements in ascending order using bubble sort.
		int[] a= {3,7,1,8,2,5,0,9,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
