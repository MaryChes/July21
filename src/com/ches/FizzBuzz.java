package com.ches;

public class FizzBuzz 
{

	public static void main(String[] args) 
	{
		for (int i = 110; i > 0; i--) 
		{
			
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) 
			{
				System.out.print("Fizz Buzz Bang");
				
			}
			else if (((i % 3) == 0) && ((i % 5) == 0))
			{
				System.out.print("Fizz Buzz");
			}
			else if (((i % 3) == 0) && ((i % 7) == 0))
			{
				System.out.print("Fizz Bang");
			}
			else if (((i % 7) == 0) && ((i % 5) == 0))
			{
				System.out.print("Buzz Bang");
			}
			else if ((i % 3) == 0)
			{
				System.out.print("Fizz");
			}
			else if ((i % 5) == 0)
			{
				System.out.print("Buzz");
			}
			else if ((i % 7) == 0)
			{
				System.out.print("Bang");
			}
			else
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
