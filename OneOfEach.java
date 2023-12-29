
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach 
{
	public static void main (String[] args) 
	{
		boolean sucsess = false;
		boolean girl = false; // smaller than 0.5
		boolean boy = false; // bigger than 0.5
		int count = 0;
		double x = 0;
		while (sucsess == false)
		{
			if ((girl && boy) == true)
			{
				break;
			}
			x= (double)(Math.random());
			if (x <= 0.5)
			{
				girl = true;
				count ++;
				System.out.print("g ");
			}
			 else if (x > 0.5)
			{
				boy = true;
				count ++;
				System.out.print("b ");
			}
			if ((girl && boy) == true)
			{
				sucsess = true;
			}

		}
		System.out.println();
		System.out.println("You made it... and you now have " +count+ " children.");

	}
}
