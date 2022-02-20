import java.util.*;


class Sorting
{
   public void SelectionSortX(int Arr[])
   {
      int i = 0, j = 0, minindex = 0, temp =0 ;
      int size = Arr.length;

      for ( i = 0; i<size ;i++ ) 
      {
         minindex = i;

         for (j = i ; j<size ;j++ ) 
         {
            if(Arr[minindex] > Arr[j])
            {
               minindex = j ;
            }           
         }
         temp = Arr[i];
         Arr[i] = Arr[minindex];
         Arr[minindex]= temp;
      }
   }
}

class SelectionSort
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

      obj.SelectionSortX(Arr);
   
   System.out.println("Data After Function call");
      for (int i = 0; i < Arr.length ;i++ ) 
      {
         System.out.print(Arr[i]+" ");   
      }
   }
}