/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]); 
		for (int i = 1; i <= x; i++)
		{
			if ( i % 2 ==0 )
			{
				System.out.print(" ");
			}
			for (int z = 1; z <= x; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
