//3. Write a java program which accept string from user and return
//difference between frequency of small characters and frequency
//of capital characters.

import java.util.*;

class StringDemo
 {
   public int CountDiff(String str)
    {
       char Arr[] = str.toCharArray();
       int i = 0, iCntSmall = 0, iCntBig = 0;

       for (i = 0;i < Arr.length ;i++ )
          {
            if((Arr[i] >= 'A') && (Arr[i] >= 'Z'))
               {
                 iCntBig++;
               }
            else 
              {
                iCntSmall++;
              }   
          }
       return iCntBig - iCntSmall;   

    }

 }

class Assignment_31_3
 {
   public static void main(String[] args)
    {
      Scanner sObj = new Scanner(System.in);
      String Arr;
      int iRet = 0;

      System.out.println("Enter the String");
      Arr = sObj.nextLine();
        
      StringDemo dObj = new StringDemo();
      
      iRet = dObj.CountDiff(Arr);

      System.out.println("The Difference is : "+iRet);  

    }

 }