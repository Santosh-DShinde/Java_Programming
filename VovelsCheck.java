//4. Write a java program which accept string from user and check
//whether it contains vowels in it or not.

import java.util.*;

class StringDemo
 {
   public int CountDiff(String str)
    {
       public int CountVowels()
      {
         char Arr[] = str.toCharArray();

         int iCnt = 0, i = 0;

         for (i = 0;i < Arr.length ; i++ )
          {
            if( (Arr[i] == 'A') || (Arr[i] == 'I') || (Arr[i] == 'E') || (Arr[i] == 'O') || (Arr[i] == 'U') ||
                (Arr[i] == 'a') || (Arr[i] == 'i') || (Arr[i] == 'e') || (Arr[i] == 'o') || (Arr[i] == 'u')   )
              {
                iCnt++;
              }
          }
       return iCnt; 
      }
 }

class Assignment_31_3
 {
    public static void main(String Arg[])
    {
      Marvellous mObj = new Marvellous();
      int iRet = 0;

      mObj.Accept();
      mObj.Display();

      iRet =  mObj.CountVowels();

      System.out.println("Number Of Vowels in string is : "+iRet);
    }


 }