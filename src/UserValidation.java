
import java.util.Scanner;
public class UserValidation 
{
	public static void main(String[] args) throws InvalidUserException
	{
		System.out.println("Enter user name:---");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String message = "Invalid User Name please enter sarath as a name";
		if(name.equals("sarath"))
			System.out.println("valid user");
		else
			throw new InvalidUserException(message);
	}
}
class InvalidUserException extends Exception
{
	public InvalidUserException(String message){
		super(message);
	}
}
