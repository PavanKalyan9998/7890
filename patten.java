class Patten
{
	public static void main(String args[])
	{
		/*int r=4;
		for(int x=1;x<=r;x++)
		{
			for(int y=x;y<=r;y++)
				
				System.out.print("  ");
			for(int y=1;y<=x;y++)
				System.out.print("* ");
			for(int y=1;y<x;y++)
				System.out.print("* ");	
			
			System.out.println();
		}*/

		/*int r=4;
		for(int x=1;x<=r;x++)
		{
			for(int y=x;y<=r;y++)
				
				System.out.print("  ");
			for(int y=1;y<=x;y++)
				System.out.print("* ");
			for(int y=1;y<x;y++)
				System.out.print("* ");	
			
			System.out.println();
		}
		
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=x;y++)
				
				System.out.print("  ");
			for(int y=x;y<=r;y++)
				System.out.print("* ");
			for(int y=x;y<r;y++)
				System.out.print("* ");	
			
			System.out.println();
		}*/

		/*int r=6;
		for(int x=1;x<=r;x++)
		{
			for(int y=x;y<=r;y++)
			if(y==r || x==1 || y==x)
				
				System.out.print("* ");
			else
				System.out.print("  ");
			System.out.println();
		}*/

		int r=6;
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=x;y++)
			if(y==1 || x==r || y==x)
				
				System.out.print("* ");
			else
				System.out.print("  ");

			System.out.println();
		}
				
	}
}