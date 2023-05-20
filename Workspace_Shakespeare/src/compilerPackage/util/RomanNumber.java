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
//	// prova 1
//	int test = 3;
//	System.out.println((double)test / 10);
//	String romanNumber = "III";
//	double newScene = (double) decode(romanNumber) / 10;
//	System.out.println(newScene);
//
//	// prova 2
//	double scenicMoment = 1.1;
//	String romanNumber = "III";
//	if (!isRoman(romanNumber))
//		System.out.println("invalid number");
//	else {
//		// sarebbe bello arrotondare, però va e penso che in caso di moooolte scene potrebbe dare problemi
//		double newScene = (double) decode(romanNumber) / 10;
//		if ((scenicMoment - (int) scenicMoment) > newScene) {
//			System.out.println("already defined in act");
//		} 
//		else if ((scenicMoment + newScene - 0.1) > (scenicMoment + 0.1)) {
//			System.out.println("skipped scene");
//		} else {
//			scenicMoment = scenicMoment + 0.1;
//			System.out.println(scenicMoment);
//		}
//	}
//}
}
