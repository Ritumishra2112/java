package demo;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rate=10;
try {
	int div=rate/0;
}catch(Exception e) {
	throw new ArithmeticException("not divide by 0");
}
	}

}
