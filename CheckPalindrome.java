
import java.util.*;

 class StringX
 {
 	public String str;

 	public void Accept()
 	{
 		Scanner sobj = new Scanner(System.in);
 		System.out.println("Enter String");
 		str = sobj.nextLine();
 	}

 	public void Display()
 	{
 		System.out.println("String is :"+str);
 	}
 }
class ChkPalindrome extends StringX

{
     public boolean CheckPalindrome()
     {
        char Arr[] = str.toCharArray();
        int iSatart = 0,iEnd = Arr.length-1 ;
        char temp ;
        while(iSatart < iEnd)
        {
            temp = Arr[iSatart];
            Arr[iSatart] = Arr[iEnd];
            Arr[iEnd] = temp;
            iSatart++;
            iEnd--; 
        }
        String Newstr = new String(Arr);
        boolean bRet = Newstr.equals(str);
        return bRet;
    }
}

class  CheckPalindrome
{
    public static void main(String[] args) 
    {

    ChkPalindrome mobj = new ChkPalindrome();
   mobj.Accept();
   mobj.Display();
   boolean bRet;

        bRet = mobj.CheckPalindrome();
        if (bRet==true)
        {
                System.out.println("String is Palindrome :");
        }
        else
        {
            System.out.println("String is not palindrome");
        }      
    }
}