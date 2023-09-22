package compilerPackage.util;

import java.util.ArrayList;

public class CharacterDescriptor {

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
