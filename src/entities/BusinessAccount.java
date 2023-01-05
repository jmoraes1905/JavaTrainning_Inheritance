package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	private Double loanTax = 10.00;
	//If the superclass constructor had some particular logic implememnted, we could use the super() field in the standard constructor
	public BusinessAccount() {
		
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//super calls the superclass constructor 
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public Double getLoanTax() {
		return loanTax;
	}
	public void setLoanTax(Double loanTax) {
		this.loanTax = loanTax;
	}
	public void loan(double amount) {
		if(this.loanLimit>= amount)
			//deposit(amount);
			//We need to make the balance attribute protected instead of private to visualize in the subclass
			balance += amount - loanTax;
	}
}
