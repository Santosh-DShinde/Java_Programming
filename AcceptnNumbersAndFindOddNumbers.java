//2.Write a program which accept number from user and return the
//count of odd digits.

import java.util.*;

class Digit
  {
    public int CountOdd(int iNo)
      {
        int iCntOdd = 0, iDigit = 0;

        if(iNo < 0)
          {
            iNo = -iNo;
          }

        while(iNo != 0)
           {
            iDigit = iNo % 10;

            if((iDigit % 2 != 0))
             {
               iCntOdd++;
             }

            iNo    = iNo / 10;
           }
        return iCntOdd;
      }
  }

class Assignment_33_2
 {
   public static void main(String args[]) 
     {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet = 0;

       System.out.println("Enter the Number");
       iValue = sObj.nextInt();

       Digit dObj = new Digit();
      
       iRet = dObj.CountOdd(iValue);

       System.out.println("The Count of ODD Digit : "+iRet);
     }

 }