public class SavingAccount extends BankAccount
{
	double accBal = this.getAccBal();

	public SavingAccount(String name, double accBal) 
	{
		super(name, accBal, 10000);
	}

	@Override
	void deposit(double amount) 
	{
		accBal = accBal + amount;
		this.setAccBal(accBal);
		System.out.println("Updated account Balance is "+this.getAccBal());
	}

	@Override
	void withdraw(int amount) 
	{
		int minBal = 10000;
		if((accBal-amount) >= minBal)
		{
			accBal = accBal-amount;
			this.setAccBal(accBal);
			System.out.println(this.getAccBal());
		}
		
		else
			System.out.println("Cannot withdraw this amount");
	}

	@Override
	public String toString() {
		return "SavingAccount : {name: "+this.getName()+" & AccBal: "+accBal+"}";
	}
}
