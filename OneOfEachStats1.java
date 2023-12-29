
public class OneOfEachStats1 
{
	public static void main (String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		boolean sucsess = false;
		boolean girl = false; // smaller than 0.5
		boolean boy = false; // bigger than 0.5
		int countchild = 0;
		int countfam = 0;
		double x = 0;
		int fam2 = 0;
		int fam3 = 0;
		int fam4 = 0;
		int max = 2;
		for (int i = 1; i <= num; i ++)
		{
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
				 countchild ++;
				 //System.out.print("g ");
			   }
			   else 
			   {
				 boy = true;
				 countchild ++;
				 //System.out.print("b ");
			   }
			   if ((girl && boy) == true)
			   {
			     sucsess = true;
			     countfam += countchild;
			     if (countchild == 2)
			     {
			  	 fam2++;
			     }
			     else if (countchild == 3)
			     {
			  	 fam3++;
			     }
			     else fam4++;
			   }
		    }
		    
		    //System.out.println();
		    //System.out.println("You made it... and you now have " +countchild+ " children.");
		    girl = false;
		    boy = false;
		    sucsess = false;
		    countchild = 0;

		}
		if((fam2 >= fam3) && (fam2 >= fam4))
		{
			max=2;
		}
		else if((fam3 > fam2) && (fam3 > fam4))
		{
			max=3;
		}
		else 
		{
			max=4;
		}	
		double avg = ((double) countfam) / num;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4);
		System.out.println("The most common number of children is " + max +".");

	}
}
