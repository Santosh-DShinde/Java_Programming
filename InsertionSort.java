import java.util.*;

class Sorting
{
   public void InsertionSort(int Arr[])
   {
      int i = 0, j = 0, key = 0;
      int size = Arr.length;

      for ( i = 1; i < size ; i++ ) 
      {
         key = Arr[i];

         for (j = i-1; (j>=0) && (Arr[j]>key ) ; j--) 
         {
            Arr[j+1] = Arr[j];
         }   
         Arr[j+1] = key ;
      }
   }
}

class InsertionSort
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

      Sorting obj = new Sorting();

      obj.InsertionSort(Arr);
   
   System.out.println("Data After Function call");
      for (int i = 0; i < Arr.length ;i++ ) 
      {
         System.out.print(Arr[i]+" ");   
      }
   }
}