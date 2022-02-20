import java.io.*;
import java.util.*;

class Q7
{

   public static void main(String[] args)
     {
         String type;

         
             Scanner sObj = new Scanner(System.in);    

             System.out.println("Enter the Directory name : ");
             type = sObj.nextLine();  

             File MakeDir = new File(type);
 
             if(MakeDir.mkdir())
               {
                System.out.println("Directory is created");
               }     
             else 
               {
                System.out.println("Directory cannot be created");
               }  
         
        /*  catch(IOException exception)
             {
               System.out.println("An unexpected error is occured...");
               exception.printStackTrace();
             } 
        */
     }
}