//Prodyut choudhury
/*Q) Write a program to Menu driven program using switch statement
( Find addition, subtraction, multiplication and division of to integer numbers )*/
import java.util.Scanner;
class Calculation 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int choice;
		int num1=0;
		int num2=0;
		//printing the choice
		System.out.println("Enter the choices :");
		System.out.println("Choice 1 : addition");
		System.out.println("Choice 2 : Substraction");
		System.out.println("Choice 3 : Multiplication");
		System.out.println("Choice 4 : Division");
		choice=sc.nextInt();

		System.out.println("Enter the first number");
		num1=sc.nextInt();

		System.out.println("Enter the Second number");
		num2=sc.nextInt();

//using switch case to calculate according to the choice
		switch(choice)
		{

			case 1:
				//adding the two numbers and displaying it.
				int sum=num1+num2;
			System.out.println("Choice 1 : addition Answer="+sum);
			break;

			case 2:
				//Substracting the two numbers and displaying it.
				int sub=num1-num2;
			System.out.println("Choice 1 : addition Answer="+sub);
			break;

			case 3:
				//Multiplication of the two numbers and displaying it.
				int mul=num1*num2;
			System.out.println("Choice 1 : addition Answer="+mul);
			break;

			case 4:
				//Division of the two numbers and displaying it.
				double div=num1/num2;
			System.out.println("Choice 1 : addition Answer="+div);
			break;

			default:
				//Displaying a message for wrong choice
				System.out.println("Invalid choice, please choose the option from 1-4");
			break;

		}
	}
}
