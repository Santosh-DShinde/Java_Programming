import java.util.*;

class StringX
{
	public void PrintName()
	{
		String name;
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Enter Your Name : ");
		name = sobj.nextLine();
		System.out.println("Your Name iS : "+name);
	}
}

class Stringinjava
{
	public static void main(String Args[])
	{
		StringX pobj = new StringX();

		pobj.PrintName();
	}
}