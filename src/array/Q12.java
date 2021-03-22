package array;
public class Q12 {

	public static void main(String[] args) {
		//Write a program to create an array of its anti-diagonals from a given square matrix.

		int a[][]= {
				  
				{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}
				};
		int count=0;
		for (int i = 0; i < a.length; i++) {	
			for (int j = 0; j < a.length; j++) {
				
				if(j-i!=0 && i+j!=3)
				{
					count++;
				}
			}	
		}
		int[]b=new int[count];
		int index=0;
       for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(j-i!=0 && i+j!=3)
				{
					b[index]=a[i][j];
				    index++;			
				}
			}
			
		}
		for (int j = 0; j < b.length; j++) {
			
			System.out.print(b[j]+" ");
			
		}
		
		

	}

}
