import java.util.*;

 class StringX
 {
 	public String str;

 	public void Accept()
 	{
 		Scanner sobj = new Scanner(System.in);
 		System.out.println("Enter String");
 		str=sobj.nextLine();
 	}

 	public void Display()
 	{
 		System.out.println("String is :"+str);
 	}
 }

class StringPass2 //extends StringX
{
	public static void main(String[] args) 
	{
 		StringX stobj = new StringX();
 		stobj.Accept();
 		stobj.Display();
	}
}