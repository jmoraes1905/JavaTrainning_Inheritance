package entities;

public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance+=balance*this.interestRate;
	}
	//The withdraw method is overwritten so that withdrawing from this king of account is tax free
	//Use the word @Override to sign the overwritting
	@Override
	public void withdraw(double amount) {
		balance -=amount;
	}
}
