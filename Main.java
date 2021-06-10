import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("  Enter 1->teaching 2->Technical 3->contract ");
			Scanner s = new Scanner(System.in);
			int q = s.nextInt();
			
			switch(q)
			{
			case 1:
				Teaching teach [] = new Teaching[3];//creating an array of objects
				for(int i=0; i<teach.length; i++)
				{
					System.out.println("  Enter the details of : "+ (i+1));
					teach[i] = new Teaching();
				}
				System.out.println("  The details are:");
				System.out.println("_____________________________________________");
				System.out.println("_____________________________________________");
				for(int i=0; i<teach.length; i++)
				{
					teach[i].displayTeach();
				}
				break;
				
			case 2:
				Technical tech[] = new Technical[3];
				for(int i=0; i<tech.length; i++)
				{
					System.out.println("  Enter the details of : "+ (i+1));
					tech[i] = new Technical();
					
				}
				System.out.println("  The details are:");
				System.out.println("_____________________________________________");
				System.out.println("_____________________________________________");
				for(int i=0; i<tech.length; i++)
				{
					tech[i].displaytech();
				}
				break;
				
			case 3:
				Contract con[] = new Contract [3];
				for(int i=0; i<con.length; i++)
				{
					System.out.println("  Enter the details of : "+ (i+1));
					con[i] = new Contract();
				}
				System.out.println("  The details are:");
				System.out.println("_____________________________________________");
				System.out.println("_____________________________________________");
				for(int i=0; i<con.length; i++)
				{
					con[i].displayContract();
				}
				break;
				
		    default:
					System.exit(0);
			}
			
		}
		
		
	}

}
