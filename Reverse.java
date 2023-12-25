/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse 
{
	public static void main (String[] args)
	{
		String word = args[0];
		int leng = word.length();
		int mid = 1;
		int middle = 0;
		for (int i=leng-1; i>=0; i--)
		{
			if (mid == i)
			{
				middle = i;
			}
			System.out.print(word.charAt(i));
			mid++;
		}
		System.out.println();
		System.out.println("The middle character is :" + word.charAt(middle));
	}
}
