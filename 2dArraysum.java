class A{
  void show(int b[][])
  {  System.out.println("2d array is=>");
       for(int i=0;i<b.length;i++)
	   {	
          for(int j=0;j<b[i].length;j++)
	      { System.out.print(b[i][j]);
	      System.out.print("\t\t");
	      }
		  System.out.println("");
		
       }  int sum=0;
	     for(int i=0;i<b.length;i++)
	    {	
           for(int j=0;j<b[i].length;j++)
	       { sum=sum+b[i][j]; 	      
	       }
		}
		 System.out.println("sum of 2d array is="+sum);
  }
}
class B{
  public static void main(String args[])
  { int a[][]={{2,3,10},{4,6,7},{34,12,89}};
    A c=new A();
    c.show(a);
  }
}  