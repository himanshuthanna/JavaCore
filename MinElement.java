 class A{
	static void show(int b[])
	{   int m=b.length;
		for(int i=0;i<b.length;i++)
		  {
			System.out.println(b[i]);
		  }  
		  int min=b[0];
		for(int i=0;i<b.length-1;i++)
		{ 
	      if(b[i]<b[i+1])
			{ min=b[i];
		      
		    }
		else { int temp=b[i+1];
		        b[i+1]=b[i];
				b[i]=temp;
			
		     }
	
	    }
	System.out.println("min value="+b[0]);
   }
 }
 class D{
	public static void main(String args[])
    { int c[]={1,10,3,4,8,9};
      A.show(c);
      
    }
}
  	
	