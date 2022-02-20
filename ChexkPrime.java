import java.util.*;

class Marvellous
{
	boolean CheckPrimeNo(int iNo)
	{
		return true;
	}
}



 class CheckP
 {
  public static void main(String[] args) 
  {
  	boolean bRet=0;
  	int iValue =0;
	 	Scanner sobj = new Scanner();

	 	System.out.println("Enter Number :");
	 	iValue=sobj.nextInt();

	 	Marvellous Mobj = new Marvellous();
		bRet=Mobj.CheckPrimeNo(iValue);

		if(bRet == true)
		{
			System.out.println("It is prime number :");
		}
		else
		{
				System.out.println("It is not prime number :");
		}


 	}
 }