class A1{
	  A1(int a)
	  { System.out.println(a);
	  }
	 int x=0;
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
		 B1()
		 
	       { super(4);
		   System.out.println("constr B1");
	       }
       		 
       }
	  class C1{
		   public static void main(String args[])
		   { B1 a1=new B1();
		   a1.show();
		   a1.print();
		   
		   }
	  }
		   
	   
	 