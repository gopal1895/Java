package array;
public class Q8 {

	public static void main(String[] args) {
		//Write a program to find the second largest element in anarray
		int[] a= {2,3,4,5,1,3,6,8,9};
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
		System.out.println("Second Largest Element : "+a[a.length-2]);
	}

}
