package application;



public class Account {
	
	private String number;
	private double balance;
	private String name;
	private String email;
	private String phoneNo;
	
	public Account(String number, double balance, String name, String email, String phoneNo) {
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	
	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", name=" + name + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public void depositeMoney(double depositedMoney) {
		this.balance+=depositedMoney;
		System.out.println("Deposite is successfully done, new balance is Rs. " + this.balance);
	}
	
	public void withdrawMoney(double withdraMoney) {
		if(this.balance-withdraMoney < 0) {
			System.out.println("Withdrawal is unsuccessful. Available account balance is Rs. " + this.balance );
		}
		else {
			this.balance-=withdraMoney;
			System.out.println("Withdrawal of Rs. "+ withdraMoney + "is succesful." + "Current balance amount is Rs."+ this.balance);
		}
	}
	

}
