package array;

public class Q9 {

	public static void main(String[] args) {
	//Write a program to find maximum element in a matrix.
		int[][] a= {
				{13,4,5,1},
				{33,24,5,91},
				{73,34,15,348},
				{23,74,125,31}
		};
		int maxval =0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					if(a[i][j]>a[i][k])
					{
						if(maxval<a[i][j])
							maxval =a[i][j];
					}
					else
					{
						if(maxval<a[i][k])
							maxval =a[i][k];
					}
				}
			}
		}
		System.out.println("Max element :"+maxval);

	}

}
