package array;

public class Q14 {

	public static void main(String[] args) {
	//Write a program to print all the LEADERS in the array.
	//Note: An element is leader if it is greater than all the elements to its right side
		int[] a = {2,4,6,1,2,8,9,6,5,6,8};
		for (int i = 0; i < a.length; i++) {
			int cnt=0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]>a[i])
				{
					cnt++;
					break;
				}
			}	
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
	}
	}
}
