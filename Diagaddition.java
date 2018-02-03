class A{
	public static void main(String args[])
	{ int a[][]=new int[][]{{1,2,3},{2,3,4},{4,5,6},{7,8,9}};
	   B.print(a);
	   B.add(a);
		
	}
}
class B{
	static void print(int a[][])
	{
		for(int x=0;x<a.length;x++)
		{ for(int y=0;y<a[x].length;y++)
			{System.out.print(a[x][y]+"\t");}
		   System.out.println();
		}
		
		
	}
	static void add(int a[][])
	{ int sum=0;
	for(int x=0;x<a.length;x++)
		{ for(int y=a[x].length-x-1;y>=a[x].length-x+1;y--)
			{sum=sum+a[x][y];}
			
		}
		System.out.println("SUM="+sum);
	}
}