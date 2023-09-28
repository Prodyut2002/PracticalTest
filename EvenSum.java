//Prodyut Choudhury
//Q) 1. Write a program to find the sum of even numbers between 25 to 51.
class EvenSum 
{
	public static void main(String[] args) 
	{
		//initializing the starting number with 25
		int start = 25;
		//initializing the ending number with 51
		int end = 51;
		int i=0;
		int sum=0;
		// Using the loop traversing the numbers
		for(i=start;i<=end;i++)
		{
			//using the if statement adding the even numbers
			if(i%2==0)
			{
				sum=i+sum;
			}
		}
		System.out.println("The sum of the even numbers = "+sum);
	}
}