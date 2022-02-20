import java.util.*;

class Marvellous
{
	boolean CheckPrimeNo(int iNo)
	{
        int iCnt=0;
		boolean bflag=true;

		for(iCnt=2;iCnt<=iNo/2;iCnt++)
		{
			if(iNo % iCnt ==0)
			{
				bflag = false;
				break;
			}
		}
		return bflag;
	}
}
 class CheckPrime
 {
    public static void main(String[] args) 
    {
    	boolean bRet=false;
  	   int iValue =0;
	 	Scanner sobj = new Scanner(System.in);

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