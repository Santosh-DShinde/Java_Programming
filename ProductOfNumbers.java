//5. Write java program which accept N numbers from user and return
//product of all odd elements.


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

    public int Product()
     {
      int iCnt = 0, iMult = 1;


      for (iCnt = 0; iCnt < Arr.length ; iCnt++ ) 
        {
          if((Arr[iCnt] % 2 != 0))
            {
              iMult = iMult * Arr[iCnt];

            }
        }
      return iMult;
      
     }
  }  

class Assignment_34_5

 {
  public static void main(String args[])
    {
       Scanner sObj = new Scanner(System.in);
       int iSize = 0;
       int iRet = 0;

       System.out.println("Enter the Array Size : ");
       iSize = sObj.nextInt();
       

       NumberX nObj = new NumberX(iSize);
       
       nObj.getter();
       nObj.setter();

       iRet = nObj.Product();

       System.out.println("The Product of odd Numbers is : "+iRet);
        
    }
 }