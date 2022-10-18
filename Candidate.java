package demo;

public class Candidate {
	Candidate(int age){
		if(age>=18) {
			System.out.println("candidate is eligible for vote"+age);
			System.out.println("candidate is eligible for drive"+age);
		}
		else
		{
			System.out.println("candidate is not eligible for vote"+age);
			System.out.println("candidate is not eligible for vote"+age);
		}
	}
	public static void main(String[] args) {
	new Candidate(15);	
	}

}
