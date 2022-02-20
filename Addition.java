import java.util.*;


class Addition
{
	public static void main(String arg[])
	{
		 Scanner sobj = new Scanner(System.in);
		int iNo1=0,iNo2=0,Ans=0;

		System.out.println("Enter First Number :");
		iNo1=sobj.nextInt();

		System.out.println("Enter Second Number :");
		iNo2=sobj.nextInt();

		Ans = iNo1+iNo2;
		System.out.println("Addition Is :"+Ans);


	}
}

 