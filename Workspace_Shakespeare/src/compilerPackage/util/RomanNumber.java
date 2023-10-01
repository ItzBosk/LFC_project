package compilerPackage.util;

public class RomanNumber {
	
	public static boolean isRoman(String s){
	    return s.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
	}
	
	public static int decodeSingle(char letter) {
		switch(letter) {
			case 'M': return 1000;
			case 'D': return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
			default: return 0;
		}
	}
	
	public static int decode(String romanNumber) {
		int result = 0;
		// loop over all but the last character
		for(int i = 0; i < romanNumber.length()-1; i++) {
			// if this character has a lower value than the next character
			if (decodeSingle(romanNumber.charAt(i)) < decodeSingle(romanNumber.charAt(i+1))) {
				result -= decodeSingle(romanNumber.charAt(i));  // subtract it
			} else {
				result += decodeSingle(romanNumber.charAt(i));  // add it
			}
		}
		// decode the last character, which is always added
		result += decodeSingle(romanNumber.charAt(romanNumber.length()-1));
		return result;
	}
	
//	public static void main(String[] args) {
//		String rn = "IIIX";
//		System.out.println(decode(rn));
//	}

}
