
public class Contract extends Staff
{
	int contract_period;
	
	Contract()
	{
		super();
		System.out.println("  Enter the contract time period");
		contract_period = super.s.nextInt();
	}
	
	public void displayContract()
	{
		super.display();
		System.out.println("  PERIOD        - "+contract_period);
		System.out.println("_____________________________________________");
		System.out.println("_____________________________________________");
	}
}
