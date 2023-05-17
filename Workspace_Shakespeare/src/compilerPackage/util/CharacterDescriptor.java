package compilerPackage.util;

public class CharacterDescriptor {
	public String name;
	public int value;
	public boolean onStage;
	
	public CharacterDescriptor (String n, int t) {
		name = n;
		value = t;
		onStage = false;
	}
}
