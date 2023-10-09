package compilerPackage.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Hashtable;

public class CharacterDescriptor {

private static String[] charList = {"Banquo","Gertrude","Ghost","Hamlet","Juliet","Ladymacbeth",
		"Mercutio","Ophelia","Polonio","Prospero","Romeo","Shylock"};
	
	public static void setPersonaePhotoPath(String personae,String sourcepath) throws IOException {
		Files.copy(Paths.get(sourcepath),Paths.get("./resources/images/custom_"+personae+".jpg"), StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void setBasePhotoPath() throws IOException {
		for(String f : charList) {
			setPersonaePhotoPath(f,"./resources/images/base_"+f+".jpg");
		}
	}

	public static void resetPersonaePhotoPath(String personae) throws IOException {
		setPersonaePhotoPath(personae,"./resources/images/base_"+personae+".jpg");
	}
		

	public String name;
	public boolean onStage;
	private int currentValue;
	private ArrayList<Integer> memoryList;
	
	public CharacterDescriptor(String n) {
		name = n;
		onStage = false;
		currentValue = 0;
		memoryList = new ArrayList<Integer>();
	}

	public void assignValue(int ii) {
		this.currentValue = ii;
	}

	public int getValue() {
		return this.currentValue;
	}

	public void push(int ii) {
		this.memoryList.add(0, ii);
	}

	public boolean pop() {
		if (this.memoryList.size() < 1)
			return false;
		this.currentValue = this.memoryList.get(0);
		this.memoryList.remove(0);
		return true;
	}
	
	public ArrayList<Integer> getStack() {
		return this.memoryList;
	}
}
