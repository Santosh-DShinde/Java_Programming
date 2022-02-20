//4. Write Java program which accept number of rows and number of columns
//from user and display below pattern.
//Input : iRow = 4,iCol = 3;
//       *   *   * 
//       *   *   * 
//       *   *   * 
//       *   *   * 
////////////////////////////////////////////////////////////////////////


import java.util.*;

class Pattern
 {
   public void pattern(int iRow, int iCol)
     {
      int i = 0, j = 0;

       for(i = iRow ; i >= 1; i--)
         {
          for(j = 1; j <= iCol; j++)
             {
                System.out.print("*\t");    
             }
            
            System.out.println("\n");
         }

     }

 }

class Assignment_37_1
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