package Unit01;

public class P3_Task_01_ClaculatorInJava {
	 static int a=10;
		public static void main(String[] args) {
	       calculator c=new calculator();
	       c.sum(9,5);
	       sum(8,4);
	       diff(4,2);
	       c.multi(9, 9);
	       c.div(81,9);
	       a=10;
		}
		public static void sum(int a,int b)
		  {
			System.out.print("Sum is: ");  
			System.out.println(a+b);
		  }
		public static void diff(int a,int b)
		  {
			System.out.print("Difference is: ");  
			System.out.println(a-b);
		  }
		  public  void multi(int a,int b)
		  {
			  System.out.print("Multiplication is: ");
			  System.out.println(a*b);
		  }
		  public  void div(int a,int b)
		  {
			  System.out.print("Division is: ");
			  System.out.println(a/b);
		  }
	}
	class calculator
	{
	  public  void sum(int a,int b)
	  {
		  System.out.print("Sum is: ");
		  System.out.println(a+b);
	  }
	  public  void diff(int a,int b)
	  {
		  System.out.print("Diffrence is: ");
		  System.out.println(a-b);
	  }
	  public  void multi(int a,int b)
	  {
		  System.out.print("Multiplication is: ");
		  System.out.println(a*b);
	  }
	  public  void div(int a,int b)
	  {
		  System.out.print("Division is: ");
		  System.out.println( a/b);
	  }
}



/*
OUTPUT:
Sum is: 14
Sum is: 12
Difference is: 2
Multiplication is: 81
Division is: 9
*/
