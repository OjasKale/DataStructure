package character;

public class CharFucntions {

	public static void main(String[] args) {
		char a = 'a';
		char[] b = {'a','b','c'};
		
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isDigit(8));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('c'));
		for (char c : b) {
			System.out.println(Character.toUpperCase(c));
		}
		
	}

}
