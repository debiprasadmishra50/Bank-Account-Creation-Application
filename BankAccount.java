public abstract class BankAccount 
{
	private String name;
	private double accBal;

	public BankAccount(String name , double accBal, double minAccountBalance)
	{
		if(accBal < minAccountBalance)
		{
			System.out.println("Account cannot Be Created");
			System.exit(0);
		}
		else
		{
			this.accBal = accBal;
			this.name = name;
			System.out.println("Account Created");
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	abstract void deposit(double amount);
	abstract void withdraw(int amount);
	
	@Override
	public String toString() {
		return "BankAccount Object";
	}
}
