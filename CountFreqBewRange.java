//3.Write a program which accept number from user and return the
//count of digits in between 3 and 7.

import java.util.*;

class Digit
  {
    public int CountRange(int iNo)
      {
        int iCnt = 0, iDigit = 0;

        if(iNo < 0)
          {
            iNo = -iNo;
          }

        while(iNo != 0)
           {
            iDigit = iNo % 10;

            if((iDigit >= 3) && (iDigit <= 7))
             {
               iCnt++;
             }

            iNo    = iNo / 10;
           }
        return iCnt;
      }
  }

class Assignment_33_3
 {
   public static void main(String args[]) 
     {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet = 0;

       System.out.println("Enter the Number");
       iValue = sObj.nextInt();

       Digit dObj = new Digit();
      
       iRet = dObj.CountRange(iValue);

       System.out.println("The Count of Between 3 to 7 Digit : "+iRet);
     }

 }