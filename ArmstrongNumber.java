 //  371 =  3**3 + 7**3 + 1**3
 //3422 = 3*4 + 4*4 + 2*4 + 2*4

 import java.util.*;

class Marvellous
{
	boolean CheckArmstrong(int iNo)
	{
        int temp=0,iDigitcnt=0,iDigit=0,iPower=1;
        int iCnt=0,iSum=0;

        if(iNo <0 )
        {
        	iNo = -iNo;
        }

        temp=iNo;

        while(temp != 0)
        {
        	iDigitcnt++;
        	temp=temp/10;
        }

        temp = iNo;

        while(temp != 0)
        {
        	iDigit=temp % 10;

        	for(iCnt=1;iCnt<=iDigitcnt;iCnt++)
        	{
        		iPower = iPower * iDigit;
        	}
         
        	iSum = iSum+iPower;
        	iPower=1;
        	temp = temp /10;
        }

        if(iSum == iNo)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
}
 class  ArmstrongNumber 
 {
    public static void main(String[] args) 
    {
    	boolean bRet=false;
  	   int iValue =0;
	 	Scanner sobj = new Scanner(System.in);

	 	System.out.println("Enter Number :");
	 	iValue=sobj.nextInt();

	 	Marvellous Mobj = new Marvellous();
		bRet=Mobj.CheckArmstrong(iValue);

		if(bRet == true)
		{
		System.out.println("It is Armstrong number :");
		}
		else
		{
		System.out.println("It is not Armstrong number :");
		}
 	}
 }