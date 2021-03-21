package array;

public class Q2 {

	public static void main(String[] args) {
	//Write a program to test if an array contains a specific value
		int[] a= {2,3,4,5,51,66,22};
		int sv =50;
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==sv)
			{
				System.out.print("Specific value contains "+a[i]);
				
				break;
			}
			cnt++;
		}
		if(a.length==cnt)
		{
			System.out.print("Sorry! Specific value not contain");
			
		}

	}

}
