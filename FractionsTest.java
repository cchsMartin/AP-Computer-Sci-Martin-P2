import java.util.Scanner;

public class FractionsTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first numerator and denominator separated by a space.");
		int num1 = scan.nextInt();
		int den1 = scan.nextInt();
		
		System.out.println("Enter second numerator and denominator separated by a space.");
		int num2 = scan.nextInt();
		int den2 = scan.nextInt();
		
		Fractions frac1 = new Fractions(num1,den1);
		Fractions frac2 = new Fractions(num2,den2);
		
		Fractions.addFractions(frac1.getNum(), frac1.getDen(), frac2.getNum(), frac2.getDen());
		Fractions.subFractions(frac1.getNum(), frac1.getDen(), frac2.getNum(), frac2.getDen());
		Fractions.multFractions(frac1.getNum(), frac1.getDen(), frac2.getNum(), frac2.getDen());
		Fractions.divFractions(frac1.getNum(), frac1.getDen(), frac2.getNum(), frac2.getDen());

	}
}
