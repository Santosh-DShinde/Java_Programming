import java.util.*;
import java.io.*;

class  Buffer
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
	    BufferedReader bobj = new BufferedReader(iobj);

		// BufferedReader bobj  = new BufferedReader(new InputStreamReader(System.in));   //This Syntax Also Valid.

		String Str;

		System.out.println("Enter Your Name :");
		Str = bobj.readLine();

		System.out.println("Enter Your Age :");
		int age = Integer.parseInt(bobj.readLine());

		System.out.println("Your Name is : " +Str);
		System.out.println("Your Age is : "+age);

	}
}