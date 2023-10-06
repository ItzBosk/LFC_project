package compilerPackage.util;

import java.util.ArrayList;
import java.util.Hashtable;

public class CharacterDescriptor {
	
private static Hashtable<String,String> photos;
	
	public static void modifyPhotoPath(String personae,String path) {
		photos.replace(personae,path);
	}
	
	public static String getPhotoPath(String personae) {
		return photos.get(personae);
	}
	
	public static void createBasePhotoPath() {
		photos = new Hashtable<String,String>();
		photos.put("Banquo", "base_Banquo.jpg");
		photos.put("Gertrude", "base_Gertrude.jpg");
		photos.put("Ghost", "base_Ghost.jpg");
		photos.put("Hamlet", "base_Hamlet.jpg");
		photos.put("Juliet", "base_Juliet.jpg");
		photos.put("Ladymacbeth", "base_Ladymacbeth.jpg");
		photos.put("Mercutio", "base_Mercutio.jpg");
		photos.put("Ophelia", "base_Ophelia.jpg");
		photos.put("Polonio", "base_Polonio.jpg");
		photos.put("Prospero", "base_Prospero.jpg");
		photos.put("Romeo", "base_Romeo.jpg");
		photos.put("Shylock", "base_Shylock.jpg");
	}

	public static void resetPhotoPath(String personae) {
		photos.replace(personae, "base_"+personae+".jpg");
	}
	
	public static void resetAllPhotoPath() {
		createBasePhotoPath();
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
