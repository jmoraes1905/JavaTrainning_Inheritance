package javatrainning_inheritance;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria",0.0, 500.00);
		
		// UPCASTING: we are currently setting an object of the derived class (subclass) to the base class (superclass)
		//No problems with upcasting since a BusinessAccount is an Account
		Account acc1 = bacc;
		//acc2 and acc3 are still Account objects, therefore we can't use methods and parameters of derived classes through then
		//acc2.loan() does not compile. We need to downcast acc2 first
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 750.00);
		Account acc3 = new SavingsAccount(1003, "Anna", 0.0, 0.5);
		
		//DOWNCASTING: we try to assign an object of the superclass (base class) to a derived class (subclass)
		//The downcasting is not accepted by the compiler unless we do it manually 
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		//BusinessAccount acc5 = (BusinessAccount)acc3 causes class cast exception when the program runs, but doesn't produce compiling errors - careful!
		//We can avoid this by testing the object class using the word instanceof
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan granted!");
		}
		
		else if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Balance updated!");
		}
	}

}
