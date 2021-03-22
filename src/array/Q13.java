package array;

public class Q13 {

	public static void main(String[] args) {
	//Write a program to test the equality of two arrays
		int[] a= {2,3,4,5,1,2,7,8};
		int[] b = {2,3,4,5,1,2,7,8};
		int cnt=0;
		if(a.length==b.length)
		{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
			if(a[i]==b[i])
			{
				cnt++;
				i++;
			}
			else
				break;
			}
		}
		}
		if(cnt==a.length)
		{
			System.out.println("equality");
		}
		else
		{
			System.out.println("Not equality");
		}
	}

}
