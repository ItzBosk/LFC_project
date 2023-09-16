package compilerPackage.util;

public class Util {
	public static String evenSpacer(String text, int totalSpace) {
		if (text.length()>totalSpace)
			return "";
		totalSpace -= text.length();
		while(totalSpace!=0) {
			text += " ";
			totalSpace -=1;
		}		
		return text;
	}

	public static String evenSpacer(int text, int totalSpace) {
		return evenSpacer(String.valueOf(text),totalSpace);
	}
	
	public static String middleSpacer(String text, int totalSpace) {
		if (text.length()>totalSpace)
			return "";
		totalSpace -= text.length();
		if(totalSpace%2==1)
			totalSpace+=1;
		while(totalSpace!=0) {
			text = " "+text+" ";
			totalSpace -=2;
		}		
		return text;
	}
	
	public static String middleSpacer(int text, int totalSpace) {
		return middleSpacer(String.valueOf(text),totalSpace);
	}
}
