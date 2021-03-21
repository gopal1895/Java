package array;

public class Q1 {

	public static void main(String[] args) {
		//Write a program to find the index of an array element.
		int[]a = {1,2,3,4,5,6,2,4};
		int val=0,cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==val)
			{
				System.out.print("Index of: "+val+" :> "+i);
				
				break;
			}
			else
			 cnt++;
		}
		if(cnt==a.length)
			System.out.println("Index not found");

	}

}
