package Unit01;

public class P5_Task02_ArrayInJava {
		public static void main(String[] args) {
			int[] a=new int [] {1,2,3,4,7};
			// Rotating
			for(int i=0;i<=2;i++) {
				int j, x=a[0];
				for(j=0;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				a[j]=x;
			}
			System.out.print("Array after left rotation: ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		}
}


/*
OUTPUT :
Array after left rotation: 4 7 1 2 3 
*/
