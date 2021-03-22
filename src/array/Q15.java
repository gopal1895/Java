package array;

public class Q15 {

	public static void main(String[] args) {
	//Write a program to get the difference between the largest and smallest values in an array of integers.
		int[] a = {2,3,4,5,7,2,7,9,3};
		int ln=0,sn=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1])
				{
					int t =a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
				
			}
			if(i==0)
				sn =a[i];
			if(i==a.length-1)
				ln = a[i];
		}
		System.out.println("Diffrent between Smallest values and Larges value: "+ (ln-sn));
	}

}
