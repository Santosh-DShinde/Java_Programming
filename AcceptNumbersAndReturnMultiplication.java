//4.Write a program which accept number from user and return
//multiplication of all digits.

import java.util.*;

class Digit
  {
    public int Multiply(int iNo)
      {
        int iDigit = 0, iMult = 1;

        if(iNo < 0)
          {
            iNo = -iNo;
          }

        while(iNo != 0)
           {
            iDigit = iNo % 10;

            if(iDigit != 0)
              {
                iMult = iMult * iDigit;
              }  

            iNo    = iNo / 10;
           }
        return iMult;
      }
  }

class Assignment_33_4
 {
   public static void main(String args[]) 
     {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet = 0;

       System.out.println("Enter the Number");
       iValue = sObj.nextInt();

       Digit dObj = new Digit();
      
       iRet = dObj.Multiply(iValue);

       System.out.println("The Multiplication of Digit : "+iRet);
     }

 }