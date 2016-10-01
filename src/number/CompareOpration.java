/*
 * -----compareTo() Method-----
 * The method compares the Number object that invoked the method 
 * to the argument. It is possible to compare Byte, Long, Integer, etc.
 * However, two different types cannot be compared, both the argument 
 * and the Number object invoking the method should be of the same type.
 * If the Integer is equal to the argument then 0 is returned.
 * If the Integer is less than the argument then -1 is returned.
 * If the Integer is greater than the argument then 1 is returned.
 */

package number;

public class CompareOpration {

	public static void main(String[] args) {
		Integer x = 10;
		System.out.println(x.compareTo(10));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(15));
	}
}
