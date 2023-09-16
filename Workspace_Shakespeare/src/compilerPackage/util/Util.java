package compilerPackage.util;

public class Util {
	public static String evenSpacer(String Text, int totalSpace) {
		if (Text.length()>totalSpace)
			return "";
		totalSpace -= Text.length();
		while(totalSpace!=0) {
			Text += " ";
			totalSpace -=1;
		}		
		return Text;
	}

	public static String evenSpacer(int text, int totalspace) {
		return evenSpacer(String.valueOf(text),totalspace);
	}
}
