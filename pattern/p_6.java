class p_6
{
public static void main(String args[])
{

   for(int i=1;i<=5;i++)
   {
      for(int k=5;k>6-i;k--)
	  { 
       System.out.print(" ");
	  }
      for(int j=1;j<=(2*(5-i)+1);j++)
	  { 
       System.out.print("*");
	  }
	  System.out.println();
   }
   
}
}