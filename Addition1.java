import java.util.*;

class Marvellous
{
	public int Addition(int Brr[])
	{
		int iSum=0,i=0;

		for(i=0;i<Brr.length;i++)
		{
			iSum = iSum+Brr[i];
		}

  return iSum;
	}
}

class Addition1
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0,iCnt = 0,iRet=0;

		System.out.println("Enter Number oF Elements");
		iSize=sobj.nextInt();

		int Arr[] = new int [iSize];

		System.out.println("Enter Numbers :");

		for(iCnt =0 ; iCnt< Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}

		Marvellous Mobj = new Marvellous();

		iRet = Mobj.Addition(Arr);
		System.out.println("Addition is :"+iRet);
	}
}