//1. Write java program which accept N numbers from user and accept
//one another number as NO , check whether NO is present or not.

import java.util.*;

class Array3
  {
    public int Arr[];

      public Array3(int iSize)
        {
          Arr = new int[iSize];
        }

      public void getter()
        {
          Scanner sObj = new Scanner(System.in);
          int iCnt = 0;
          
          System.out.println("Enter the Array elements : ");
          for (iCnt = 0; iCnt < Arr.length ; iCnt++ ) 
             {
               Arr[iCnt] = sObj.nextInt();
             }
        } 
      public void setter()
        {
          int iCnt = 0;

          System.out.println("The Entered Number is : ");
          for (iCnt = 0; iCnt < Arr.length ; iCnt++ )
            {
              System.out.println(Arr[iCnt]);
            }
        }  
  }
class NumberX extends Array3
  {
    public NumberX(int iValue)
     {
      super(iValue);
     }

    public boolean Check(int iNo)
     {
      int iCnt = 0, iCount = 0;

      for (iCnt = 0; iCnt < Arr.length ; iCnt++ ) 
        {
          if(Arr[iCnt] == iNo)
            {
              break;
            }
        }
      if(iCnt != Arr.length )
        {
          return true;
        } 
      else 
        {
          return false;
        }   
     }
  }  

class Assignment_34_1
 {
  public static void main(String args[])
    {
       Scanner sObj = new Scanner(System.in);
       int iSize = 0,iNo = 0;
       boolean bRet = false;

       System.out.println("Enter the Array Size : ");
       iSize = sObj.nextInt();
       
       System.out.println("Enter the Searching Number : ");
       iNo = sObj.nextInt();

       NumberX nObj = new NumberX(iSize);
       
       nObj.getter();
       nObj.setter();

       bRet = nObj.Check(iNo);

       if(bRet == true)
         {
            System.out.println("Entered Number is Present : ");
         }
       else 
         {
           System.out.println("Entered Number is Not Present : ");
         }  
    }
 }