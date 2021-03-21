package array;

public class Q3 {

	public static void main(String[] args) {
//Write a program to remove a specific element from an array.
		int[] a= {22,44,55,11,66,77,33};
		int se =30;
		int len =a.length-1;
		int cnt=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==se)
			{
				a[i]= '\s';
			}
			else
				cnt++;
		}
		int[] na = new int[cnt];
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=' ')
			{
				na[i]=a[i];
			}
		}
		if(a.length!=cnt)
		{
			for (int i = 0; i < na.length; i++) {
				System.out.print(na[i]+" ");
			}
		}
		else
		{
			System.out.println("Sorry!! specific element not found");
		}
	}

}
