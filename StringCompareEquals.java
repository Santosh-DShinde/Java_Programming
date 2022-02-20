
//String comparison in java

class DemoString
{
	public static void main(String[] args)
    {
		String str1 = "HELLO";              //1 way
		String str2 = new String("HELLO");  // 2 way
		char Arr[] = {'H','E','L','L','O'};  
		String str3 = new String(Arr);      //3 way
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("String length is :"+str1.length());
		//if we want to get string lenth  then we use the string.length() method; 

		System.out.println("String length is :"+Arr.length);

 	String s1 = "Demo";   //String literals
 	String s2 = "Demo";
 	String s3 = "Demo";

 	String s4 = new String("Demo");  //String literals
 	String s5 = new String("Demo");
 	String s6 = new String("Demo");


 	for(int j=0;j<s6.length();j++)
 	{
 		System.out.println(s6.charAt(j));
 	}


 	char Brr[] = s6.toCharArray();
 	for(int i =0;i< Brr.length;i++)
 	{
 		System.out.println(Brr[i]);
 	}

     String sobj1 = "Hello";
     String sobj2 = "Hello";
     String sobj3 = new String ("Hello");

     if(sobj1 == sobj3)
     {
     	System.out.println("Equal");
     }
     else
     {
     		System.out.println("Non Equal");
     }

     if (sobj1.equals(sobj3))
      {
     		System.out.println("Equal");	
     }
     else
     {
     		System.out.println("Non Equal");
     }

	}
}