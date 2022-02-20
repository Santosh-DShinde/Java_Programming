//1.Write a Java program which accept string from user and count
//number of capital characters.

import java.util.*;

class StringDemo
 {
   public int CountCapital(String str)
       {
          int iCount = 0, i = 0;
          char Arr [] = str.toCharArray();

          for(i = 0; i < Arr.length; i++)
             {
              if((Arr[i] >= 'A') && Arr[i] <= 'Z')
                {
                  iCount++;
                } 
             }
        return iCount;
       }
 }
 
class Assignment_31_1
 {
    public static void main(String arg[])
      {
        Scanner sObj = new Scanner (System.in);
        int iRet = 0;

        System.out.println("Enter the String");
        String  str = sObj.nextLine();   

        StringDemo dObj = new StringDemo();

        iRet = dObj.CountCapital(str);

        System.out.println(iRet); 
      }
 }
