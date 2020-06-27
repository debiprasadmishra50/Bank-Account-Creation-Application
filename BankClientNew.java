public class BankClientNew 
{
	public static void main(String[] args) 
	{
		BankAccount ac1 = new SavingAccount("Debi", 10000.00);
		BankAccount ac2 = new CurrentAccount("Debi Prasad", 50000.00);
		BankAccount ac3 = new SalaryAccount("Debi Prasad Mishra", 50000.00);
		
//		ac1.withdraw(4500);
//		ac1.deposit(5000);
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac3);
		
	}

	@Override
	public String toString() {
		return "BankNewClient Object";
	}
}
