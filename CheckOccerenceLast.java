//3. Write java program which accept N numbers from user and accept
//one another number as NO , return index of last occurrence of that NO. 

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

    public void Display(int iStart, int iEnd)
     {
      int iCnt = 0;
      if(iStart > iEnd)
        {
          return -1;
        }

       for (iCnt = 0; iCnt < Arr.length; iCnt++) 
          {
            if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
              {
              System.out.println("Entered Number is Presents : "+ Arr[iCnt]);
              }
          }
       
     }
  }  

class Assignment_34_4

 {
  public static void main(String args[])
    {
       Scanner sObj = new Scanner(System.in);
       int iSize = 0;
       int iStart = 0, iEnd = 0;

       System.out.println("Enter the Array Size : ");
       iSize = sObj.nextInt();
       
       System.out.println("Enter the Searching Starting point : ");
       iStart = sObj.nextInt();

       System.out.println("Enter the Searching Ending point : ");
       iEnd = sObj.nextInt();

       NumberX nObj = new NumberX(iSize);
       
       nObj.getter();
       nObj.setter();

       nObj.Display(iStart,iEnd);

        
    }
 }