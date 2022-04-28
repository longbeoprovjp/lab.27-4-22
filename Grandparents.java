package Class;

public class Grandparents extends cl{
	private String granName;
	
	static int numPpGran;
	static int getNumPpGran() {
		return numPpGran;
	}

	public Grandparents(String n, int a) {
		granName = n;
		ppAge = a;
		numPpGran++;
	}
	public Grandparents(String n, int a, String j, int i, String h) {
		super(n, a, j, i, h);
		granName = n;
		numPpGran++;
	}
	public String getGranName() {
		return granName;
	}
	public void setGranName(String n) {
		granName = n;
	}
	public void Print7() {
		System.out.println(getGranName() + " is " + getAge() + " years old.");
	}
}
