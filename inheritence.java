class A1{
	 private int x=0;
	 void show()
	     { System.out.println("heelo A");
	     }   
       }
	   
	 class B1 extends A1{
	 int y=1;
	 void print()
	     { System.out.println("hello B");
		   System.out.println(y);
	     }   
       }
	  class C1{
		   public static void main(String args[])
		   { B1 a1=new B1();
		   a1.show();
		   a1.print();
		   
		   }
	  }
		   
	   
	 