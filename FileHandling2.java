import java.io.*;
import java.util.*;
import java.lang.*;

class CreatFile
{
    public void CreateFile(String Strx)
    {
        try
        {
            File fobj = new File(Strx);

            if(fobj.createNewFile())
            {
                System.out.println("File "+fobj.getName()+ " Is Successfully Created");
            }
            else
            {
                System.out.println("File "+fobj.getName()+ "Is Already Exist");
            }
        }
        catch(IOException obj)
        {
            System.out.println("IO Exception Occured");
        }
    }
}
class FileHandling2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name :");
        String Str = sobj.nextLine();

        CreatFile Cobj =  new CreatFile();

        Cobj.CreateFile(Str);
    }
}