package application;

public class Main {
	public static void main(String[] args) {
		Account abhaysAccount= new Account("545545", 0.0, "mohan", "gayatri@gmail.com", "9600096000");
		System.out.println("Welcome " + abhaysAccount.getName());
		abhaysAccount.depositeMoney(500);
		abhaysAccount.withdrawMoney(200);
		
	}
	
	
	
	

}
