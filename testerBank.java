abstract class Bank {
	
	public abstract int getBalance();

}

class BankA extends Bank{
	
	int initial_deposit = 100;
	
	public int getBalance(){
		return initial_deposit;
	}

}

class BankB extends Bank{
	
	int initial_deposit = 150;
	
	public int getBalance(){
		return initial_deposit;
	}

}

class BankC {
	
	int initial_deposit = 200;
	
	public int getBalance(){
		return initial_deposit;
	}

}

public class testerBank {
    public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB();
		BankC C = new BankC();
		System.out.println("Amount in bank A : " + (1000 + A.getBalance()));
		System.out.println("Amount in bank B : " + (1000 + B.getBalance()));
		System.out.println("Amount in bank C : " + (1000 + C.getBalance()));

	}
}
