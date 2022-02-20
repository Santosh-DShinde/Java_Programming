import java.util.*;

class Marvellous
{
	public int Addition(int i,int j)
	{
		int iResult =0;
		iResult=i+j;
		return iResult;
	}
}

class Addition3
{
	public static void main(String arg[])
	{
		 Scanner sobj = new Scanner(System.in);
		int iNo1=0,iNo2=0,Ans=0;

		System.out.println("Enter First Number :");
		iNo1=sobj.nextInt();


		System.out.println("Enter Second Number :");
		iNo2=sobj.nextInt();

		Marvellous Mobj = new Marvellous();
		Ans=Mobj.Addition(iNo1,iNo2);

		System.out.println("Addition Is :"+Ans);
	}
}