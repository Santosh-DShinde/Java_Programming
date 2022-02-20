package ProblemsOnNumbers;

import java.util.*;


public class ArrayX
 {
    public int Arr[];

   public ArrayX(int iSize)
    {
       Arr = new int[iSize]; 
    }

    public void Accept()
     {
       Scanner sObj = new Scanner(System.in);
       int iCnt = 0;

       System.out.println("Enter the Array Element : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
          {
            Arr[iCnt] = sObj.nextInt();
          }

     }
    public void Display()
     {
      int iCnt = 0;

      System.out.println("Entered Element are :");
       for (iCnt = 0; iCnt < Arr.length ; iCnt++ ) 
         {
           System.out.println(Arr[iCnt]);
         }
     }
 }
