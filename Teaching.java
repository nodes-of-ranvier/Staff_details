
public class Teaching extends Staff
{
	String domain, publication;
	
	Teaching()
	{
		super();
		System.out.println("  Enter the domain");
		domain = super.s.next();
		System.out.println("  Enter the publication");
		publication = super.s.next();
	}
	
	public void displayTeach()
	{
		super.display();
		System.out.println("  DOMAIN        - "+domain);
		System.out.println("  PUBLICATION   - "+publication);
		System.out.println("_____________________________________________");
		System.out.println("_____________________________________________");
	}
	
}
		