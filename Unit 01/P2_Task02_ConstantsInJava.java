package Unit01;

public class P2_Task02_ConstantsInJava {
	protected static final double PRICE=234.90;
    public static final double PRICE2=65.90;
	public static void main(String[] args) {
		int a=10;
		a=11;
		System.out.println(PRICE);
		System.out.println(PRICE2);
		System.out.println(a);
//	    PRICE=67.90;	constants cannot be reassigned
	}
}
