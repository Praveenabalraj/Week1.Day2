package week1.day2;

public class Calculator {
	
	public void add (int a, int b) {
		System.out.println(a+b);	
	}
	
	public void sub (int a, float b) {
		System.out.println(a-b);	
	}
	
	public void mul (double a, int b, double c) {
		System.out.println(a*b*c);
	}
	
	public void div (long a, double b, float c) {
		System.out.println(a/b/c);
	}	

	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.add(1, 1);
		ca.sub(2, 1);
		ca.mul(12, 10, 123);
		ca.div(12345, 123, 12.12f);
	}

}
