package Class;

public class Neighbors extends cl{
	private String address;
	
	static int numPpNei;
	static int getNumPpNei() {
		return numPpNei;
	}
	public Neighbors() {
		numPpNei ++;
	}
	public Neighbors(String n, int a, String j, int i, String h, String add) {
		super(n, a, j, i, h);
		numPpNei ++;
	}
	public void setAddress(String add) {
		address = add;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public boolean isDog() {
		if(ppJob == "Cat") {
			return true;
		}
		else {
			return false;
		}
	}
	public void Print6() {
		System.out.println(getName() + " is " + getAge() + " years old." + "He/She lives in " + getAddress());
	}
}
