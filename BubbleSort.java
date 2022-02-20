import java.util.*;

class Sorting
{
   public void BBSort(int Arr[])
   {
      int pass = 0 , j = 0 , temp = 0;
      int size = Arr.length ;

     for (pass = 0; pass < size; pass++ ) 
     {
        for ( j =0 ;j<size-pass-1 ;j++ ) 
        {
            if (Arr[j] > Arr[j+1])
            {
               temp = Arr[j];
               Arr[j]= Arr[j+1];
               Arr[j+1] = temp;
            }
        }
     }
   }
}

class BubbleSort
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

      obj.BBSort(Arr);
   
   System.out.println("Data After Function call");
      for (int i = 0; i < Arr.length ;i++ ) 
      {
         System.out.print(Arr[i] + " ");   
      }
   }
}