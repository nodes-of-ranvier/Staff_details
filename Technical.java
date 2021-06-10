public class Technical extends Staff
{
	String skills;
	
	Technical()
	{
		super();
		System.out.println("  Enter the skills");
		skills = super.s.next();
	}
	
	public void displaytech()
	{
		super.display();
		System.out.println("  SKILLS        - "+skills);
		System.out.println("_____________________________________________");
		System.out.println("_____________________________________________");
	}
}
