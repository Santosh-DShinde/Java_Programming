//1. Write Java program which accept N numbers from user and return
//difference between summation of even elements and summation of
//odd elements.

import java.util.*;

class ArrayXX
 {
    public int Arr[];

      public ArrayXX(int iSize)
       {
         Arr  = new int[iSize];
       }

      public void setterX()
       {
        Scanner sObj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter the array Elemnts : ");
         for (i = 0;i < Arr.length ; i++ )
           {
             Arr[i] = sObj.nextInt();
           }
       }

      public void GetterX()
       {
        int i = 0;

        System.out.println ("The Entered Element is :");
         for (i = 0 ;i < Arr.length ;i++ ) 
            {
               System.out.println(Arr[i]);
            } 
       } 

 }

class ArrayDemo extends ArrayXX
 {
    public ArrayDemo(int iValue)
      {
        super(iValue);
      }

    public int Difference()
      {
         int iCnt = 0,iEvenSum = 0,iOddSum = 0;

         for (iCnt = 0;iCnt < Arr.length ;iCnt++ )
           {
               if((Arr[iCnt] % 2) == 0)
                 {
                  iEvenSum = iEvenSum + Arr[iCnt];
                 }
               else 
                 {
                  iOddSum = iOddSum + Arr[iCnt];
                 }  
           }
        return (iEvenSum-iOddSum);
      }  
 
  }

class Assignment_32_1
 {
   public static void main(String[] args)
    {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0, iRet;

       System.out.println("Enter the Array Size");
       iValue = sObj.nextInt();

       ArrayDemo dObj = new ArrayDemo(iValue);

       dObj.setterX();
       dObj.GetterX();

       iRet =  dObj.Difference();

       System.out.println("Difference is : "+iRet);

    }

 }