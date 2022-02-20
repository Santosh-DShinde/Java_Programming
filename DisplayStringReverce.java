//5. Write a java program which accept string from user and display
//it in reverse order.

import java.util.*;

class StringDemo
 {
   public String ReversX(String str)
    {
      char Arr [] = str.toCharArray();

      int iStart = 0, iEnd = Arr.length - 1;
      char cTemp;

      while(iStart < iEnd)
        {
           cTemp  = Arr[iEnd];
           Arr[iEnd]   = Arr[iStart];
           Arr[iStart] = cTemp;
           
           iStart++;
           iEnd--;
        }
      return new String(Arr);
    }
 }

class Assignment_31_5
 {
    public static void main(String Arg[])
    {
      Scanner sObj = new Scanner(System.in);
      String Arr;

      System.out.println("Enter the String : ");
      Arr = sObj.nextLine();

      StringDemo dObj = new StringDemo();

      String sRet = dObj.ReversX(Arr);

      System.out.println("Number Of Vowels in string is : "+sRet);
    }


 }