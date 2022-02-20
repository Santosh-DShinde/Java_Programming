//1. Write a java program which accept number of rows and number of
//columns from user and display below pattern.
//Input : iRow = 4  iCol = 4
//Output :
//          *  *  *  #
//          *  *  #  *
//          *  #  *  #
//          #  *  *  *
//
//
//////////////////////////////////////////////////////////////////////////////


import java.util.*;

class PatternX
 {
    public void Pattern(int iRow, int iCol)
      {
        int i = 0, j = 0;

         for (i = 1;i <= iRow ;i++ )
            {
               for (j = iCol;j >= 1 ;j-- )
                  {
                     if(i == j)
                        {
                          System.out.print("#\t");
                        }
                     else 
                        {
                            System.out.print("*\t");
                        }      
                  }
               System.out.print("\n"); 
            }
      }

 }

class Assignment_40_1
 { 
   public static void main(String args[]) 
    {
      Scanner sObj = new Scanner(System.in);

      int iRow = 0, iCol = 0;

      System.out.println("Enter the Row : ");
      iRow = sObj.nextInt();

      System.out.println("Enter the Column : ");
      iCol = sObj.nextInt();

      PatternX pObj = new PatternX();

      pObj.Pattern(iRow,iCol);

    }
 }