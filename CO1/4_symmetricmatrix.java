package TestPK;
import java.util.Scanner;
public class symmetricmatrix {
	public static void main(String[] args) {
		int g=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=scan.nextInt();
		System.out.println("Enter the number of columns");
		int col=scan.nextInt();
		if(row!=col) {
			System.out.println("Matrix have different order");
		}
		else {
			int[][] a=new int[10][10];
			System.out.println("Enter the values to matrix");
			{
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						a[i][j]=scan.nextInt();
					}
				}
			}
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(a[i][j]!=a[j][i]) {
						g=g+1;
						break;
					}
					if(g>0) {
						break;
					}
					
				}
			}
			if(g==0) {
				System.out.println("It is  a Symmetric Matrix");
			}
			else {
				System.out.println("It is not a Symmetric Matrix");

			}
		}
	}


}
