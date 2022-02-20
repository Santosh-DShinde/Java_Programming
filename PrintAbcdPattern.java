//2. Write Java program which accept number of rows and number of columns
//from user and display below pattern.
//Input : iRow = 4,iCol = 4;
//       A  B  C  D
//       a  b  c  d  
//       A  B  C  D
//       a  b  c  d
////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
 {
   public void pattern(int iRow, int iCol)
     {
      int i = 0, j = 0;
       char cChar1 ;
       char cChar2 ;

       for(i = 1; i <= iRow; i++)
         {
          for(j = 1, cChar1 = 'A',cChar2 = 'a'; j <= iCol; j++, cChar1++,cChar2++)
             {
               if((i % 2 != 0))
                 {
                   System.out.print(cChar1+"\t");
                 }
               else 
                 {
                   System.out.print(cChar2+"\t");
                 }  
             }
           System.out.println("\n");  
         }

     }

 }

class Assignment_36_2
 {
   public static void main(String arg[])
     {
      Scanner sObj = new Scanner(System.in);
      int iRow = 0, iCol = 0;

      System.out.println("Enter the iRow : ");
      iRow = sObj.nextInt();

      System.out.println("Enter the iCol : ");
      iCol = sObj.nextInt();
     
      Pattern pObj = new Pattern();
     
      pObj.pattern(iRow,iCol); 

     }
 }