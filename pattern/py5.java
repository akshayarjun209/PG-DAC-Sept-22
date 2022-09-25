class py5
{
public static void main(String args[])
{
    for(int i=1;i<=9;i++)
	{
	    for(int j=9;j>=i;j--)
	    {
		System.out.print(" ");
		}
		for(int k=10-i;k<=9;k++)
		{
		System.out.print(k);
		}
		for(int z=8;z>9-i;z--)
		{
		System.out.print(z);
		}
		System.out.println();
	}


}

}



//           9
//          898
//         78987
//        6789876
//	     567898765
//	    45678987654
//	   3456789876543
//	  234567898765432
//	 12345678987654321