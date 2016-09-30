/*
 * --------xxxValue() Method--------
 * The method converts the value of the Number Object that 
 * invokes the method to the primitive data type that is 
 * returned from the method.
 */

package number;

public class XxxValue {

	public static void main(String[] args) {
		Integer x = 5;
		x = x+10;
		System.out.println(x);
		
		System.out.println("Byte Value:"+ x.byteValue());
		System.out.println("short Value:"+ x.shortValue());
		System.out.println("integer Value:"+ x.intValue());
		System.out.println("long Value:"+ x.longValue());
		System.out.println("float Value:"+ x.floatValue());
		System.out.println("double Value:"+ x.doubleValue());
		
		
		
	}
	
}
