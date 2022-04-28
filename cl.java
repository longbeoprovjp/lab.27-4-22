package Class;

public class cl {
	protected String ppName;
	protected int ppAge;
	protected String ppJob;
	protected int ppIncome;
	protected String ppHobby;
	//default constructor
	public cl() {
		numPp++;
	}
	//statics
	static int numPp;
	static int getNumPp() {
		return numPp;
	}
	// overloading constructor
	public cl(String n) {
		ppName = n;
		numPp++;
	}
	public cl(String n, int a) {
		ppName = n;
		ppAge = a;
		numPp++;
	}
	public cl(String n, int a, String j) {
		ppName = n;
		ppAge = a;
		ppJob = j;
		numPp++;
	}
	public cl(String n, int a, String j, int i) {
		ppName = n;
		ppAge = a;
		ppJob = j;
		ppIncome = i;
		numPp++;
	}
	public cl(String n, int a, String j, int i, String h) {
		ppName = n;
		ppAge = a;
		ppJob = j;
		ppIncome = i;
		ppHobby = h;
		numPp++;
	}
	//setting up setters and getters
	public void setName(String name) {
		ppName = name;
	}
	public String getName() {
		return ppName;
	}
	public void setAge(int ppAge) {
		this.ppAge = ppAge;
	}
	public int getAge() {
		return ppAge;
	}	
	public void setJob(String c) {
		ppJob = c;
	}
	public String getJob() {
		return ppJob;
	}
	public void setIncome(int i) {
		ppIncome = i;
	}
	public double getIncome() {
		return ppIncome;
	}
	public void setHobby(String h) {
		ppHobby = h;
	}
	public String getHobby() {
		return ppHobby;
	}
	//might be public methods, idk
	public boolean isAdult() {
		if(ppAge>18) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isDog() {
		if(ppJob == "Dog") {
			return true;
		}
		else {
			return false;
		}
	}
	public void Print1() {
		System.out.println("The person's name is " + getName());
	}
	public void Print2() {
		System.out.println(getName() + " is " + getAge() + " years old.");
	}
	public void Print3() {
		System.out.println(getName() + " is a " + getAge() + " year-old " + getJob() + ".");
	}
	public void Print4() {
		System.out.println(getName() + " is a " + getAge() + " year-old " + getJob() + ". He/She makes $" + getIncome() + " a month.");
	}
	public void Print5() {
		System.out.println(getName() + " is a " + getAge() + " year-old " + getJob() + ". He/She makes $" + getIncome() + " a month. He/She likes " + getHobby() + ".");
	}
}
