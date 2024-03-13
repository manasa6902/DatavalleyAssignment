public class NumbersSwap{
	public static void main(String[] args){
		int a=200,b=300;
		System.out.println("Before Swapping the numbers are: ");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping the numbers are: ");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}