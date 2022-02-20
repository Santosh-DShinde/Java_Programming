//5. Write Java program which accept String from user and display
//below pattern.
//Input : Hello
//
//   
//         H  e  l  l  *
//         H  e  l  *  *
//Output : H  e  *  *  *
//         H  *  *  *  *
//         
//        
//             
//           
//           
//
//////////////////////////////////////////////////////////////////////////////


import java.util.*;


class Stringx
  {
     public String str;

     public void Accept()
      {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the String : "); 
        str = sObj.nextLine();

      }
     public void Display()
      {
        System.out.println("The enterd String is : "+str);
      } 
  }

class Patternx extends Stringx
 {
    public void Pattern()
      {
          char Arr[];
          int i = 0, j = 0;

          Arr = str.toCharArray();

        for (i = Arr.length;i > 0 ; i--)
         {
           for (j = 0; j < Arr.length ; j++ )
             {
                if(j < i)
                  {
                    System.out.print(Arr[j]+"\t");
                  }
                else 
                  {
                     System.out.print("* \t");
                  }  
             }
         System.out.println("\n");
         }




      }      

 }  

class Assignment_39_2
 { 
   public static void main(String args[]) 
    {
      Patternx pObj = new Patternx();  

      pObj.Accept();
      pObj.Display();
      
      pObj.Pattern();

    }
 }
