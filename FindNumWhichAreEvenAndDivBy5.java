//3. Write Java program which accept N numbers from user and display
//all such elements which are even and divisible by 5.

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

    public void Difference()
      {
         int iCnt = 0,iValue = 0;

         for (iCnt = 0;iCnt < Arr.length ;iCnt++ )
           {
               if((Arr[iCnt] % 3 == 0) && (Arr[iCnt] % 5 == 0))
                 {
                   System.out.println("The Number Divisible by 5 :"+Arr[iCnt]);
                 } 

           }
      }  
 
  }

class Assignment_32_4
 {
   public static void main(String[] args)
    {
       Scanner sObj = new Scanner(System.in);
       int iValue = 0;

       System.out.println("Enter the Array Size");
       iValue = sObj.nextInt();

       ArrayDemo dObj = new ArrayDemo(iValue);

       dObj.setterX();
       dObj.GetterX();
       dObj.Difference();


    }

 }