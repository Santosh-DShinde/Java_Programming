import java.io.*;
import java.util.*;
import java.lang.*;

class WriteFile
{
    public void CreateFile(String Namex,String Strx)
    {
        try
        {
            FileWriter fobj = new FileWriter(Strx);

            fobj.writeString(Namex,Strx);
        
                System.out.println("Data Is Successfully Written in  File");
            
        }

        catch(IOException obj)
        {
            System.out.println("IO Exception Occured");
        }
        
    }
}
class FileHandlingWrite2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Data To Write into The Existing File  :");
        String Str = sobj.nextLine();

        System.out.println("Enter File Name");
        String Strx = sobj.nextLine();

        WriteFile Wobj =  new WriteFile();

        Wobj.CreateFile(Str,Strx);
    }
}