package compilerPackage.util;

import java.util.ArrayList;

public class CharacterDescriptor {

	public String name;
	public boolean onStage;
	private ArrayList<Integer> memoryList;

	public CharacterDescriptor(String n, int t, boolean o) {
		name = n;
		onStage = o;
		memoryList = new ArrayList<Integer>();
		memoryList.add(t);
	}
	
	public boolean assignValue(int ii) {
		if(this.memoryList.size()<1) {
			return true;
		}		
		this.memoryList.remove(memoryList.size()-1);
		this.memoryList.add(ii);
		return false;
	}
	
	public int firstElement() {
		return this.memoryList.get(0);
	}
	
	public void push(int ii) {
		this.memoryList.add(0, ii);
	}
	public int pop() {
		int temp = this.memoryList.get(0); 
		this.memoryList.remove(0);
		return temp;
	}
}
