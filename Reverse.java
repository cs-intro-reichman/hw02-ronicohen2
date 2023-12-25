/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse 
{
	public static void main (String[] args)
	{
		String word = args[0];
		if (args.length == 0)
		{
			System.out.println("Please provide a word.");
		}
		int mid = 0;
		for (int i = word.length() - 1; i >= 0; i-- )
		{
			System.out.print(word.charAt(i));
		}

		System.out.println();
		int middle = word.length()/2;
		System.out.println("The middle character is " + word.charAt(middle));
	}
}
