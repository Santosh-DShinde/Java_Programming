//2. Write a java program which accept string from user and count
//number of small characters.

import java.util.*;

class StringDemo
 {
   public int CountSmall(String str)
    {
       char Arr[] = str.toCharArray();
       int i = 0, iCnt = 0;

       for (i = 0; i < Arr.length ; i++ )
          {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
              {
                iCnt++;
              }
          }
      return iCnt;

    }

 }

class Assignment_31_2
 {
    public static void main(String[] args)
      {
        Scanner sObj = new Scanner(System.in);
        String arr;
        int iRet = 0;

        System.out.println("Enter the String");
        arr = sObj.nextLine();
        
        StringDemo dObj = new StringDemo();

        iRet = dObj.CountSmall(arr);

        System.out.println("The Count of Small Character : "+iRet);

      }


 }