
import java.util.*;

 class StringX
 {
 	public String str;

 	public void Accept()
 	{
 		Scanner sobj = new Scanner(System.in);
 		System.out.println("Enter String");
 		str=sobj.nextLine();
 	}

 	public void Display()
 	{
 		System.out.println("String is :"+str);
 	}
 }
class Marvellous extends StringX

{
     public String ReverceX()
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
        return new String(Arr);
        //return 
    }
}

class ReverceStr
{
    public static void main(String[] args) 
    {

    Marvellous mobj = new Marvellous();
   mobj.Accept();
   mobj.Display();
   String s = mobj.ReverceX();

    System.out.println("Return String Is :"+s);     
       
    }
}