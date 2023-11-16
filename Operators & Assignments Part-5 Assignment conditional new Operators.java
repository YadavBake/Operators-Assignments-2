
													  Operators & Assignments Part-5 ||Assignment,conditional,new Operators
													=========================================================================
													
----------------------- 
  Assignment operators 
------------------------

 -> There are 3 types of assignment operators.

	1. Simple assignment operator.
		
		Ex.
			int x = 10;
			
	2. chained assignment operator.
	
		Ex. 
		int a,b,c,d;
		a = b = c = d = 20;
		System.out.println(a+".."+b+".."+c+"...."+d);
						 //20	  20	20		 20
	  
		- We can't performe chained assignment directly at the time of declaration.
		
			int a = b = c = d = 20; //CE: cannot find syboml: Symbol : variable b c,d, location : class Test 

		-
		
			int  b,c,d
			int  a = b = c = d = 20; //valid 

			
	3. compound assignment operator.
		
		- Some time assignment operator mixed with some other operator such type of assignment operators are called compound assignment operators.
		
		
		Ex. 
		
		int  a = 10;
		a += 20;
		System.out.println(a);//30
		
		- The following are all possible compound assignment operators in java.
		
		
						-------------------
						| +=  |	&= | >>=  |	
						| -=  | |= | >>>= |			
						| *=  | ^= | <<=  |
						| /=  |	   |      |
						| %=  |    |      |
						-------------------
		
	 -> In the case compound assignment operators internal type-casting will be performed automatically.
	 
		Ex.

		byte b = 10;								byte b = 10;					byte b = 10;						byte b = 127;
		b = b+1;                        			b++;                            b+=1;  //(b= (byte) (b+1)           b+ = 3;
		System.out.println(b);          			System.out.println(b);//11     System.out.println(b);               System.out.println(b); //-126
					
	  //max(int byte int) = int 					b=(byte)(b+1)					
	  //CE: PLP: found:int required :byte 
		
		
		
	 


		int a,b,c,d;
		
		a = b = c = d = 20;
		
		a +=  b -= c *= d /= 2;
		
		System.out.println(a+"..."+b+"..."+c+"...."+d);
						 //-160   -180    200		10 			
		
		
		
---------------------------------
 11. Conditional Operaptors(?,:)
----------------------------------

 -> The only possible ternory operator in java is conditional operator
 
	a++ , ++a ==> It is called unary operator because it is use singel operand.
	
	a+b ==> It is called Binary operator because it is use double operand.
	
	(c) ? b:d=== It is called time operator because it is use three operand.
 
 Syntax: 
 
	int x = (10<20)? 30:40;
	System.out.println(x);// 30
	
 -> We can performe nesting of conditional operator also.
 
 
	int x = (10>20) ? 30 : ((40>50)? 60: 70);
	System.out.println(x); //70;
	
	
----------------------
  12. new operators.	
----------------------

-> We can use 'new' operator to create object.

	Ex. 
	
	
		Test t = new Test();

  Note: 
  
  1. After creating an object constructor will be executed to performe initialization of an object. Hance a constructor is not for creation of object and it is for initialization
	 of an object.
	   
  2. In java we have only new keyword but not delete keyword because distruction of useless objects is the responsibility of garbage collector.


---------------------
  13. [] operators.  
---------------------

 -> We can use these operator to declare and create arrays.
 
	Ex.
 
		int [] x = new int[10];
		

















  




































  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		