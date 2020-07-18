package Com.DesignPrinciples;

import java.util.Scanner;

public class ConsoleApplication {

	public static void main(String[] args)
	{
		int confirm;
		Scanner sc = new Scanner(System.in);
		confirm=1;
		try
		{
		while(confirm!=0)
		{
			float operand1 = sc.nextFloat();
			float operand2 = sc.nextFloat();
			sc.nextLine();
			char choice = sc.nextLine().charAt(0);
			MathsOperations object = new MathsOperations();
		     switch(choice) {
		       case '+':
			     System.out.println(object.addition(operand1, operand2));
			     break;
		       case '-': 
			     System.out.println(object.subtraction(operand1, operand2));
			     break;
		       case '*':
			     System.out.println(object.multiplication(operand1, operand2));
			     break;
		       case '/':
			     System.out.println(object.division(operand1, operand2));
			     break;
		}	
		     System.out.println("do you want to continue");
		     confirm=sc.nextInt();
		} 
		sc.close();
		System.out.println("calculator is turned off");
		}
		catch(Exception e)
		{
			System.out.println("Please Enter values in Integer format");
		}
	}

}
