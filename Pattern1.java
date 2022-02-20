//1. Write Java program which accept String from user and display
//below pattern.
//Input : Hello
//
//Output : H  e  l  l  o
//         H  e  l  l  
//         H  e  l  
//         H  
//
////////////////////////////////////////////////////////////////////////////



import java.util.*;

class Stringx
 {
    String str;

    public void Accept()
     {
      Scanner sObj = new Scanner(System.in);

      System.out.println("Enter the String : -");
      str = sObj.nextLine();
      
     }
    public void Display()
     {
      System.out.println(str);
     } 
 }

class Pattern extends Stringx
   {
      
    public void pattern()
     {
       char Arr[];
       int i = 0, j = 0;

       Arr = str.toCharArray();

       for (i = 0;i < Arr.length ; i++ )
         {
           for (j = 0; j < Arr.length ; j++ )
             {
                System.out.print(Arr[j]+"\t");
             }
           System.out.println("\n");
         }
      } 
   }


class Assignment_38_1
 { 
   public static void main(String args[]) 
    {
      Pattern pObj = new Pattern();

      pObj.Accept();
      pObj.Display();
      
      pObj.pattern();

    }
 }