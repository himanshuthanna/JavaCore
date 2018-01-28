class Add{
	void add(int b[])
	{ int sum=0;
	
	  for(int i=0;i<b.length;i++)
	  { sum=sum+b[i];
	  }
      System.out.println("sum of array element is="+sum);	  
    }
}
class Arr{
	public static void main(String arrgs[])
	{ 
		int a[]={4,6,2,9,10};
		System.out.println("array elements are:");
		for(int i=0;i<a.length;i++)
		{ System.out.print(a[i]);
	       System.out.print(",");
			
		}
		System.out.println("\n");
	
		Add c=new Add();
		c.add(a);
	}
}
	