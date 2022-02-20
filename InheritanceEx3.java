import java.util.Scanner;

import MarvellousNumbers.ArrayX;    ////user Define package

class Marvellous extends ArrayX
{

	public Marvellous(int iValue)
	{
		super(iValue);  //implicite calls the ArrayX constructor
	}

	public int Add()
	{
		int iSum = 0,iCnt=0;

		for(iCnt=0;iCnt< Arr.length;iCnt++)
		{
			iSum= iSum+Arr[iCnt];
		}
		return iSum;
	}
}

class inheritanceEx3
{
	public static void main(String[] args) 
	{
		
		Scanner sobj = new Scanner(System.in);
		int iLength =0,iRet=0;

	System.out.println("Enter Number oF Elements :");
	iLength = sobj.nextInt();

	Marvellous mobj = new Marvellous(iLength);

	mobj.Accept();
	mobj.Display();
	iRet = mobj.Add();
	System.out.println("Addition is :"+iRet);

	}
}
