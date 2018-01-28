 class A{
	static void show(int b[])
	{   int m=b.length;
		for(int i=0;i<b.length;i++)
		  {
			System.out.println(b[i]);
		  }  
		  int max=b[0];
		for(int i=0;i<b.length;i++)
		{ 
	      if(b[i]>max)
			{ max=b[i]; 
		      
		    }
		
	
	    }
	System.out.println("max value="+max);
   }
 }
 class D{
	public static void main(String args[])
    { int c[]={1,10,3,22,100,4,8,9,102};
      A.show(c);
      
    } 
}
  	
	