import ProblemsOnNumbers.ArrayX;
import java.util.*;

/*class ArrayX
 {
    public int Arr[];

   ArrayX(int iSize)
    {
       Arr = new int[iSize]; 
    }

    void Accept()
     {
       Scanner sObj = new Scanner(System.in);
       int iCnt = 0;

       System.out.println("Enter the Array Element : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
          {
            Arr[iCnt] = sObj.nextInt();
          }

     }
    void Display()
     {
      int iCnt = 0;

      System.out.println("Entered Element are :");
       for (iCnt = 0; iCnt < Arr.length ; iCnt++ ) 
         {
           System.out.println(Arr[iCnt]);
         }
     }
 }
 */

class Logic extends ArrayX
 {

   public

   Logic (int iLength)
     {
      super(iLength);
     }

   void DIvByTwo()
     {
        int iCnt = 0;

        for (iCnt = 0 ;iCnt < Arr.length ; iCnt++ ) 
          {
            if((Arr[iCnt] % 2 == 0))
              {
                 System.out.println("The Number : " +Arr[iCnt]+ " is divisible by 2");
              }
          }

     }


 }


class First
 {
   public static void main(String arg[])
     
     {
        Scanner sObj = new Scanner(System.in);
        int iLength = 0,iRet = 0;

        System.out.println("Enter the Array Size :");
        iLength = sObj.nextInt();

        Logic lObj = new Logic(iLength);

        lObj.Accept();
        lObj.Display();
        lObj.DIvByTwo();


     }


 }