class py4
{
public static void main(String args[])
{
    for(int i=1;i<=9;i++)
	{
	    for(int j=9;j>=i;j--)
	    {
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		System.out.print(k);
		}
		for(int z=i-1;z>=1;z--)
		{
		System.out.print(z);
		}
		System.out.println();
	}


}

}


//           1
//          121
//         12321
//        1234321
//	     123454321
//	    12345654321
//	   1234567654321
//	  123456787654321
//	 12345678987654321