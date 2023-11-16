

													Operators & Assignments Part-1 || Increment & Decrement , Arithmetic		
											===================================================================================

 1. Increment and Decrement Operators.
 2. Arithmetic Operators.
 3. String concatenation Operators.
 4. Relational operators.
 5. equality operators.
 6. instanceof operators.
 7. bitwise operators.
 8. short circuit operators.
 9. type cast operators.
10. assignment operators.
11. conditional operators.
12. new operators.
13. [] operators.
14. operator precendence.
15. Evaluation order of operands.
16. new vs newInstance().
17. instanceof vs isInstance().
18. ClassNotFoundException vs NoClassDefFoundError.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

----------------------------------------
  1. Increment and Decrement Operators.
----------------------------------------

 	 
																					
                                                                                    				   Decrement
					Increment									|
		 			   |                                                   				|
					   |                                                   	-----------------------------------------------------
		-----------------------------------------------------                       	|						    |
		|						    |                       Pre-increment operator			post-increment operator
	Pre-increment operator				post-increment operator             	y = --x;					 y = x--;
		y = ++x;					 y = x++;
		
		
		
		
	----------------------------------------------------------------------------------------------	
	|Expresion 		|	initial value of x |	value of y  |	final value of x    |
	----------------------------------------------------------------------------------------------
	|y = ++x 		|		10	   |	  11	    |		11           |
	|                       |   	                   |                |                        |
	|y = x++:		|	   	10	   |	  10	    |		11 	     |
	|	                |                          |                |                        |
	|y = --x;		|		10	   |	   9	    |		9	     |
	|	                |                          |                |                        |
	|y = x--		|		10	   |	  10	    |		9	     |
	|	                |                          |                |                        |
	----------------------------------------------------------------------------------------------

   ->  We can apply increment and decrement operators only for variables but not constant values. If we are trying to apply for constant values then we will get compile time error.
 

	Ex. 

		int x = 10;				int x =10;
		int y = ++x;                            int y = ++10;
		Sopln(y); //11                          Sopln(y);//CE Unexpected type found: value required :variable
		
		
	-> Nesting of increment and decrement operators not allowed.	
		 
			Ex. 
			
			int x = 10;  |----------->////CE Unexpected type found: value required :variable
			int y = ++(x++);
			Sopln(y);
		
	->  For final variables we can't apply increment and decrement operators.
			
			Ex. 


			int x = 10;		final int x = 10;
			x = 11 ;                x = 11 ; // ---> cannot assign a value to final variable x.
			Sopln(x);               Sopln(x);
		
		
		
			int x = 10;		final int x = 10;
			x++;                    x++ ; // ---> cannot assign a value to final variable x.
			sopln(x); //11          Sopln(x);
		
	-> We can apply increment and decrement operators for every primitive type except boolean.

		Ex. 

		int x =10;		char ch = 'a';		double d = 10.5;	    boolean b = true;
		x++;                    ch++;                   d++:                        b++; //-> operator ++ cannot be applied to boolean.
		Sopln(x); //valid       sopln(ch); //valid      sopln(d); //valid           sopln(b);
		
		
	-> Difference between 'b++' and 'b = b+1'

		-> If we apply any arithemetic operator between two variables 'a' and 'b' the result type is always: max(int, type of a m type of b)
	    
		Ex.1 	
		
			 byte a = 10;												a (+.-.*,/)b 	max (int, type of a, type of b)	
		         byte b = 20;																max(int,byte,byte) 
		         byte c = a+b; //CE : PLP foud: int required:byte. a+b == max(int byte byte)
		                                        Sopln(c);
		
		-> We can solve these problem by type casting.
			
			Ex. 
			
			byte c = (byte)(a+b);
			sopln(c);//30
		
		
		Ex.2 
			
		byte b = 10;
		b = b+1; // max(int,byte,int)==int , CE: PLP found : int required: byte ,[b = (byte)(b+1)]
		Sopln(b);		
		
		Ex.3 
					
		-> But in the case of increment and decrement operators internal type casting will be performed automatically	
			
		b++ == b=(byte)(b+1).
		
		byte b =10;
		b++;				//b++ ===> b=(type of b) (b+1)
		sopln(b); //11 
		
		
-----------------------------------------		
   2. Arithmetic Operators. (+,-,*,/,%)		
-----------------------------------------
												     -----------------------------------
  ->  If we apply any arithmetic operator between two variable 'a' and 'b' the result type  is always| max(int, type of a , type of b).|   
												     ------------------------------------


		byte +byte = int 							byte--->short---
		byte+short = int 									   |
		short +short = int									   |----> int --->long--->float--->double  	
		byte+long = long									 |---> |---->	
		long +double= double 								char-----|
		float + long= float
		char +char = int 
		
		
		Ex. 
		
			Sopln('a'+'b'); 97+98=195
			Sopln('a'+0.98); 97.98;
		
		
		
	-> Infinity:
	
		- In integeral arithmetic(byte,short,int,long) there is no way to reprasent infinity hance a if a infinity is a reuslt we will get arithmetic expection in integeral
		  arithmetic 

		Ex. 
			sopln(10/0); // RE: ArithmeticException / by Zero 
		
		-> But in floating point arithmetic (float and double ) there is a way to reprasent infinity. For these Float and Double classes containes the following two constant 
			POSITIVE_INFINITY
			NEGATIVE_INFITIY 
			
			- Hance a even though result is infinity we won't get any arithmetic expection in floating arithmetic.
			
			
					Ex. 
		
						sopln(10/0.0); // Infinity.
						sopln(-10/0.0); //-Infinity.		
		
	-> NaN (Not a Number) :-
	
		- In integeral arithmetic(byte,short,int,long) there is no way to reprasent undefine result. Hance a If the result is undefine we will get runtime expection saying 
		  ArithmeticException / by zero
		  
		  Ex. 
		
				sopln(0/0); // RE: ArithmeticException / by zero 
		
		- But in floating point arithmetic(float and double) ther is way to reprasent undefine results. For these Float and Double classes containes NaN constant hance a if the 
		  result is undefine we won't get any ArithmeticException in floating point arithmetic.
		  
		  Ex. 
		
				sopln(0.0/0); // NaN (Not a Number)
				Sopln(-0.0/0); // NaN 
		
	Note**
		
		-> For any 'x' value including NaN the following expressions returns false.
		
			Ex.
						Internally NaN define like below lines	
		                
		                x < NaN	|
		                x <= NaN|
		                x > NaN | == false  
		                x <= NaN|
		                x == NaN|
		                		|
	   -> For any 'x' value including NaN the following expressions returns true.
	
		    Ex. 
			
			x != NaN| == true 
		
		
	 											
	 Sopln(10 < Float.NaN); // false         	
	 Sopln(10 <= Float.NaN); // false        	
	 Sopln(10 > Float.NaN); // false         	
	 Sopln(10 >= Float.NaN); // false        	
	 Sopln(10 == Float.NaN); // false        	
	 Sopln(Float.NaN == Float.NaN); // false 	
	 Sopln(10! == Float.NaN); // true        	
	 Sopln(Float.NaN != Float.NaN); //true   	
		
		
 -> 
 
 
				
									  
									-> It is Runtime exception but not compile-time error.
									  
				ArithmeticException:-> It is possible only in integeral arithmetic but not in floating point arithmetic. 
									  
									-> The only operators which cause ArithmeticException are '/' and '%'.  
									  
	- 
		
		
		
		
		
		
		
	




















	
		
		
		
		
		
		
		
		
		


			
		
		
		
		
		
		
		
		
		
