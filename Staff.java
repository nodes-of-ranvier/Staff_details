import java.util.Scanner;
public class Staff 
{
	int staff_id, salary;
	String name, phone_no;
	
	Scanner s = new Scanner(System.in);
	
    Staff() 
	{
		System.out.println("  Enter the name of the staff");
		name = s.next();
		System.out.println("  Enter the staff_id of the staff");
		staff_id = s.nextInt();
		System.out.println("  Enter the phone_no of the staff");
		phone_no = s.next();
		System.out.println("  Enter the salary of the staff");
		salary = s.nextInt();
	}
	
	public void display()
	{
		System.out.println("  NAME          - "+name);
		System.out.println("  STAFF ID      - "+staff_id);
		System.out.println("  PHONE NUMBER  - "+phone_no);
		System.out.println("  SALARY        - "+salary);
	}
	
}
