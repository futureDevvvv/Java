package javaStack;

public class StringStack implements Stack {

	private String[] element;
	private int index;

	public StringStack(int capacity) {
		element = new String[capacity];
		index = -1;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return index + 1;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return element.length;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(index == -1) {
			return null;
		} 
		String s = element[index];
		index--;
		
		return s;
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		if(index == element.length -1)
			return false;
		else {
			index++;
			element[index] = val;
			return true;
		}
		
		//return false;
	}

}
