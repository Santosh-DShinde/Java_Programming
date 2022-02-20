//1.Write a java program which accept number from user and return the
//count of even digits.

import java.util.*;

class Digit
  {
    public int CountEven(int iNo)
      {
        int iCntEven = 0, iDigit = 0;

        if(iNo < 0)
          {
            iNo = -iNO;
          }

        while(iNo != 0)
           {
            iDigit = iNo % 10;

            if((iDigit % 2 == 0))
             {
               iCntEven++;
             }

            iNo    = iNo / 10;
           }
        return iCntEven;
      }
  }

class Assignment_33_1
 {
   public static void main(String args[]) 
     {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet = 0;

       System.out.println("Enter the Number");
       iValue = sObj.nextInt();

       Digit dObj = new Digit();
      
       iRet = dObj.CountEven(iValue);

       System.out.println("The Count of Even Digit : "+iRet);
     }

 }