package Unit01;

import java.util.Scanner;

public class P4_Task_01_GenericMatricMultiplication {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int r1,c1,r2,c2;
			System.out.println("enter the number of rows and column in mat1");
			r1=sc.nextInt();
			c1=sc.nextInt();
			System.out.println("enter the number of rows and column in mat2");
			r2=sc.nextInt();
			c2=sc.nextInt();
			if(c1==r2) 
			{
				int[][] mat1 = new int[r1][c1];
				System.out.println("Enter the matrix elements\n");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						mat1[i][j]=sc.nextInt();
					}
				}
				int[][] mat2 = new int[r2][c2];
				System.out.println("Enter the matrix elements\n");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						mat2[i][j]=sc.nextInt();
					}
				}
				int[][] mat3=new int[r1][c2];
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c2;j++)
					{
						mat3[i][j]=0;
					}
				}
				  for (int i = 0; i < r1; i++) 
			        {
			            for (int j = 0; j <c2;j++) 
			            {
			                for (int k = 0; k < c1; k++) 
			                {
			                    mat3[i][j]+= mat1[i][k] * mat2[k][j];
			                }
			                System.out.print(mat3[i][j]);
			                System.out.print(" ");
			            }System.out.println(" ");
			        }
				
				
			}
			else {
				System.out.println("Matrices cant be multiplied");
			}
		}
		
		

	}
}
