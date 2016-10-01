package number;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;

public class AllOprations {
	static Integer a = 10,b=20;
	static double d = -200.781212;
	public static void main(String[] args) {
		eqal();
		convString();
		parsingInt();
		absoluteVal();
		celiandfloor();
	}
	public static void eqal(){
		System.out.println("Equals Oprations:"+a.equals(b));
	}
	public static void convString(){
		System.out.println("To string Function:"+a.toString());
	}
	public static void parsingInt() {
		String abc = "15";
		
		System.out.println("Parse Int operation:"+Integer.parseInt(abc));
	}
	public static void absoluteVal() {
		System.out.println("Absolute Functoion:"+Math.abs(d));
	}
	public static void celiandfloor() {
		  double d = -100.675;
	      float f = -90;    

	      System.out.println("Celi on to double value:"+Math.ceil(d));
	      System.out.println("Celi onto the float value:"+Math.ceil(f)); 

	      System.out.println("floor on to double value:"+Math.floor(d));
	      System.out.println("floor on to the float value:"+Math.floor(f)); 
	}
	public static void rounding() {
		double a = 100.675;
		double b = 100.235;
		double c = 100;
		
		System.out.println("rint opration a,b,c:"+Math.rint(a)+","+Math.rint(b)+","+Math.rint(c));
		System.out.println("round fucntiona,b,c:"+Math.round(a)+","+Math.round(b)+","+Math.round(c));
	}
}
