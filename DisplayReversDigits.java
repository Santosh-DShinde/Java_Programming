//3. Write Java program which accept number of rows and number of columns
//from user and display below pattern.
//Input : iRow = 4,iCol = 5;
//       5   4   3   2    1
//       5   4   3   2    1
//       5   4   3   2    1 
//       5   4   3   2    1
////////////////////////////////////////////////////////////////////////


import java.util.*;

class Pattern
 {
   public void pattern(int iRow, int iCol)
     {
      int i = 0, j = 0;

       for(i = 1 ; i <= iRow; i++)
         {
          for(j = iCol; j >= 1; j--)
             {
                System.out.print(j+"\t");    
             }
            
            System.out.println("\n");
         }

     }

 }

class Assignment_37_3
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