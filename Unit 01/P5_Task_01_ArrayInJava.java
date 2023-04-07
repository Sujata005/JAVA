package Unit01;

public class P5_Task_01_ArrayInJava {
	public static void main(String[] args) {
		Duplicates();
	}
	public static void Duplicates()
	   {
		   int arr[]= {1,1,2,3,4,5,3,2,2,5};
		   int[] arr2=new int[10];
		   for(int i=0;i<10;i++)
		   {
			   arr2[arr[i]]++;
		   }
		   System.out.print("Duplicate elements are: ");
		   for(int i=0;i<10;i++)
		   {
			   
			   if(arr2[i]>1)
			   {
				   System.out.print(i +" ");
			   }
		   }
	   }
}

/*
Output:
Duplicate elements are: 1 2 3 5 
*/
