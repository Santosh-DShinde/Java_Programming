import java.io.*;
import java.util.*;

class FileX 
 {

    public String fileData;
    public String file1,file2;

     public FileX(String MAIN1,String MAIN2)
      {
          file1 = MAIN1;
          file2 = MAIN2;
      }

    public void acceptCreate()
     {

        try 

         {
            File f2 = new File(file2);

              if(f2.createNewFile())
                  {
                     System.out.println("File " + f2.getName() + " is Created Succefully....");
                  }
                else
                  {
                     System.out.println("File is already exit in the directory...");
                  }   
         }

        catch(IOException exception)
         {
            System.out.println("An unexpected error is occured...");
               exception.printStackTrace();
         } 

    }

    public void acceptRead()
     {
       
        try
             {
                
                File Fread = new File(file1);

                Scanner sObj = new Scanner(Fread);

                while(sObj.hasNextLine())
                    {
                       fileData = sObj.nextLine();

                       System.out.println(fileData);
                    }

                System.out.println("All of the above is the Data of file : ");
                  
             }
            catch(IOException exception)
             {
               System.out.println("An unexpected error is occured...");
               exception.printStackTrace();
             } 

     }

        
    public void acceptWrite()
       {
        Scanner sObj = new Scanner(System.in);

        try
             {
                
                FileWriter fwrite = new FileWriter(file2);

               // System.out.println("Type : \n");
                //TypeX = sObj.nextLine();
                
                fwrite.write(fileData);   

                fwrite.close();         

               System.out.println("Writing gets completed succefully...");        
                  
             }
            catch(IOException exception)
             {
               System.out.println("An unexpected error is occured...");
               exception.printStackTrace();
             }              

     }

 }

class Q6
 {

     public static void main(String args[]) throws Exception
       {

        String file1, file2;

         Scanner sObj = new Scanner(System.in);


         System.out.println("Enter the first file name : \n");
                  file1 = sObj.nextLine();

          System.out.println("Enter the Second File Name : \n");
                  file2 = sObj.nextLine();  


             FileX fObj = new FileX(file1,file2);
          
          fObj.acceptCreate(); 

          fObj.acceptRead();  

          fObj.acceptWrite();            

          
       }

 }