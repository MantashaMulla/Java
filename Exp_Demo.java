package ExceptionHandlingEx;
import java.util.Scanner;
public class Exp_Demo {
    public static void main(String[] args) 
    {
	Exp_Demo obj=new Exp_Demo();
	try 
	{
	    obj.demo();
	} 
	catch (Use_of_exp e) 
        {
            System.out.println("Message: "+e.getMessage());
	}
    }
    public void demo() throws Use_of_exp
    {
	int num1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Numbers");
	num1=sc.nextInt();
	if(num1>0)
	{
            throw new Use_of_exp("It is an Positive Number");
	}
	else
	{
            throw new Use_of_exp("It is an Negative Number");
	}
    }
}

