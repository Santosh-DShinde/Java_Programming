import java.util.*;

class Searching 
{
   public void Change(int Arr[])
   {
     for (int i = 0; i < Arr.length ;i++ ) 
     {
         Arr[i]++;
     }
       System.out.println("Data After Function call");
      for (int i = 0; i < Arr.length ;i++ ) 
      {
         System.out.println(Arr[i]);   
      }
   }
}

class AcceptAndDisplayArrayNo
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter The Size OF Array");
      int size = sobj.nextInt();

      int Arr[] = new int[size];

      System.out.println("Enter The Element");
      for (int i = 0;i<Arr.length ;i++) 
      {
         Arr[i] = sobj.nextInt();  
      }
      Searching obj = new Searching ();

       obj.Change(Arr);
   }
}