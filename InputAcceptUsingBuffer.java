import java.io.*;

class  Buffered
{
	public static void main(String[] args) throws Exception
	{
		//InputStreamReader iobj = new InputStreamReader(System.in);
		//BufferedReader bobj = new BufferedReader(iobj);
	BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		String Str;

		System.out.println("Enter Your Name :");
		Str = bobj.readLine();

		System.out.println("Enter Your Age :");
		int age = Integer.parseInt(bobj.readLine());

		System.out.println("Enter name : "+Str);
		System.out.println("Enter Age : "+age);

	}
}