package demo;

public class Bank {
public int RateOfInterest() {
	return 0;
}
public static void main(String[] args) {
	SBI s = new SBI();
	ICICI i = new ICICI();
	AXIS a=new AXIS();
	System.out.println(i.RateOfInterest());
	System.out.println(a.RateOfInterest());
	System.out.println(s.RateOfInterest());
}
}
class SBI extends Bank{
	public int RateOfInterest() {
		return 8;
	}
} 
class ICICI extends Bank{
	public int RateOfInterest() {
		return 7;
	}
}
class AXIS extends Bank{
	public int RateOfInterest() {
		return 9;
	}
}