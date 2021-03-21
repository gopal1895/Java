package array;

public class Q5 {

	public static void main(String[] args) {
	  //Write a program to find and display reverse of an array using third variable.
		int[] a= {3,4,5,6,1,2,3,5,6,7};
		int temp=0;
		int j=a.length-1;
		for (int i = 0; i < a.length; i++,j--) {
			if(j>i)
			{
				temp= a[i];
				a[i]= a[j];
				a[j]=temp;
			}
			else
				break;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
