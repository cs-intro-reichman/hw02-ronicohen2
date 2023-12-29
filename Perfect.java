/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect 
{
	public static void main (String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int sum = 1;
		String s = x + " is a perfect number since " + x + " = 1";
		for (int i = 2; i < x ; i++)
		{
			if (x%i == 0)
			{
				s = s + " + " + i;
				sum = sum + i;
			}
		}
		if (sum == x)
		{
			System.out.println(s);
		}
		else System.out.println(x + " is not a perfect number");

	}
}
