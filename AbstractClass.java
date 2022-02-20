 import java.util.*;

abstract class ArrayX
 {
    public int Arr[];

    public ArrayX(int size)
     {
        Arr = new int [size];
     }

    public void Accept()
     {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements");
         for(int i = 0; i < Arr.length; i++)
            {
                Arr[i] = sobj.nextInt();
            }
     } 

    public void Display()
     {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entered data is : ");
           for(int i = 0; i < Arr.length; i++)
              {
                System.out.println(Arr[i]);
              }
     } 
 }

class Sorting2
 {
     public static void main(String args[])
      {
         Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the Size of array");
         int size = sobj.nextInt();

         ArrayX aobj = new ArrayX(size);

         aobj.Accept();
         aobj.Display();
      }
 }