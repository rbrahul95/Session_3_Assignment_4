import java.util.Scanner;
public class Session_3_Assignment_4
{
       
    public static float result(float a, float b, String operator)
	{
		float result = 0;
		switch (operator)
		{
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
                    default : System.out.print("Wrong Choice!!!");
                    break;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		float num1, num2;
		float result;
		String operator;
                
		Scanner s = new Scanner(System.in);
		//System.out.println("Basic Calculator For Arithmetic Operation + , - , * ,/");
		System.out.println("--------Basic Arithmetic Calculator------------");		
		System.out.println("Enter First Number : ");
		num1 = s.nextFloat();
		System.out.println("Enter Second Number : ");
		num2 = s.nextFloat();
		System.out.println("Enter Operator : + , - , * , / ");
		operator = s.next();
		result = result(num1, num2, operator); 
		System.out.println(num1 + operator + num2 + " = " + result);
                
                
	}
	
}