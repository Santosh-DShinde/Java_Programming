 
 package MarvellousNumbers;    // User Define Package
 import java.util.*;

 public class ArrayX  
{
	public int Arr[];

	public ArrayX(int iSize) //parameterised constructor
	{
		Arr = new int[iSize];  // Resources
	}

	public void Accept()  //getter 
	{
		Scanner sobj = new Scanner(System.in);
		int iCnt =0;

		System.out.println("Enter Elements :");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}

	public void Display()  //setter
	{
		int iCnt=0;
		System.out.println("Enter Elements Are :");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

// Command For Create User Define Package
// javac ArrayX.java -d .
// that Class Should't Contain Main Function