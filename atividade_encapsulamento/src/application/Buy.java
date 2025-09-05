package application;

public class Buy {
	private String holder; 
	private int number;
	private double balance ;
	
	public Buy() {
		
	}
	public Buy(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public Buy(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
		
	}
	
	
	
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	
	}
	public int getNumber() {
		return number;
	
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
	public void deposit(double valor ) {
		balance += valor;
	}
	
	public void RemoveMoney(double valor) {
		balance -= valor + 5.0;
	}
	
	
	public String toString() {
		return "Account " + number + "," + " Holder:" + holder + 
				","  + "Balance: $ " + String.format("%.2f", balance);
	}
	
	
	
	
	
	
	
}
