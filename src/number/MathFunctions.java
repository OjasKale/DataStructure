package number;

public class MathFunctions {

	public static void main(String[] args) {
		mathF();
		trigo();
	}
	
	public static void mathF() {
		System.out.println("Minimum Value:"+Math.min(123.321, 77.1122));
		System.out.println("Minimum Value:"+Math.max(123.321, 77.1122));
		
		System.out.println("Power Fucntion:" + Math.pow(4, 5));
		System.out.println("Squar root is:" + Math.sqrt(25));
	}
	
	public static void trigo() {
		double degree = 45.0;
		double Radian = Math.toRadians(degree);
		
		System.out.format("The Value Pi is %.4f%n", Math.PI);
		System.out.format("The sine of %.1f degrees is %.4f%n", degree, Math.sin(Radian));
		System.out.format("The Cos of %.1f degrees is %.4f%n", degree, Math.cos(Radian));
		System.out.format("The Tan of %.1f degrees is %.4f%n", degree, Math.tan(Radian));
		System.out.format("The Asin of %.1f degrees is %.4f%n", degree, Math.asin(Radian));
		
	}

}
