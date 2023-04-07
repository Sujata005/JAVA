package Unit01;

import java.util.Scanner;
public class P5_Task_03_ArrayInJava {
		public static void main(String[] args) {
			deletion();
		}
		 public static void deletion()

		   {
			   Scanner sc=new Scanner (System.in);
			   System.out.print("Enter the size of an array: ");
			   int size=sc.nextInt();
			   int arr[]=new int[size];
			   System.out.print("Enter the elements of an array: ");
			   for(int i=0;i<size;i++)
			   {
				   arr[i]=sc.nextInt();
			   }
			   System.out.print("Enter the element to delete: ");
			   int element=sc.nextInt();
			   int j=0;
			   for(int i=0;i<size;i++)
			   {
				   if(arr[i]==element)
				   {
					   continue;
				   }
				   arr[j++]=arr[i];
			   }
			   System.out.print("Array after removing element: ");
			   for(int i=0;i<j;i++)
			   {
				   System.out.print(arr[i]+" ");
			   }
			   
	}
}





/*
OUTPUT:
Enter the size of an array: 10
Enter the elements of an array: 1 2 3 4 5 6 7 8 9 10
Enter the element to delete: 10
Array after removing element: 1 2 3 4 5 6 7 8 9 
*/
