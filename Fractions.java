// Program was created by Connor Horstman and Nick Lacy
public class Fractions {

	private int num; 
	private int den;
	
	
	public Fractions(int n, int d) {
		num = n;
		den = d;
	}
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	public static void addFractions(int a, int b, int c, int d) {
		//System.out.println(d * (a/b) + b * (c/d)); original attempt
		System.out.println("(" + a  + "/" + b + ")" + " + " + "(" + c  + "/" + d + ")" + " = " + ((d * a) + (b * c)) + "/" + d*b );
	}
	public static void subFractions(int a, int b, int c, int d) {
		//System.out.println(d * (a/b) - b * (c/d)); original attempt
		System.out.println("(" + a  + "/" + b + ")" + " - " + "(" + c  + "/" + d + ")" + " = " + ((d * a) - (b * c)) + "/" + d*b );

	}
	public static void multFractions(int a, int b, int c, int d) {
		//System.out.println((a/b) * (c/d)); original attempt
		System.out.println("(" + a  + "/" + b + ")" + " X " + "(" + c  + "/" + d + ")" + " = " + (a * c) + "/" + d*b );

	}
	public static void divFractions(int a, int b, int c, int d) {
		//System.out.println((a/b) * (d/c)); original attempt
		System.out.println("(" + a  + "/" + b + ")" + " / " + "(" + c  + "/" + d + ")" + " = " + (a * d) + "/" + b*c );

	}
}
	
