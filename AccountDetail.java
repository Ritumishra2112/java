package demo;

public class AccountDetail {
	long acc;
	double bal;
	String name;
	AccountDetail(long accNumber,Double balance,String aname){
		acc=accNumber;
		bal=balance;
		name=aname;
	}
	public void detail() {
		System.out.println("Account Number"+acc+"Balance"+bal+"name"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccountDetail obj=new AccountDetail(123243547,1200.25,"Riya");
obj.detail();
	}

}
