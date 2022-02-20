//5.Write a program which accept number from user and return
//difference between summation of even digits and summation of odd
//digits.

import java.util.*;

class Digit
  {
    public int CountDiff(int iNo)
      {
        int iDigit = 0, iSumEven = 0, iSumOdd = 0;


        if(iNo < 0)
          {
            iNo = -iNo;
          }

        while(iNo != 0)
           {
            iDigit = iNo % 10;

            if((iDigit % 2 == 0))
              {
                iSumEven = iSumEven + iDigit;
              }  
            else
              {
                iSumOdd = iSumOdd + iDigit;
              }  

            iNo    = iNo / 10;
           }
        return iSumEven - iSumOdd;
      }
  }

class Assignment_33_5
 {
   public static void main(String args[]) 
     {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet = 0;

       System.out.println("Enter the Number");
       iValue = sObj.nextInt();

       Digit dObj = new Digit();
      
       iRet = dObj.CountDiff(iValue);

       System.out.println("The Summation of Odd & Even Digit : "+iRet);
     }

 }