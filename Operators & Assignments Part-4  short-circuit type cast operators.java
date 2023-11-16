
														Operators & Assignments Part-4 || short-circuit,type cast operators
													=========================================================================


------------------------------------
 8. short-circuit operators (&&,||)	
------------------------------------

 -> These are excatly same as bitwise operators(&,|) except  the followong differences.

	---------------------------------------------------------------------------------------------------------------------
	|				 &,|			  					|							&&,||								|
	--------------------------------------------------------------------------------------------------------------------|
	|1. Both argumenrs should be evaluated always 		|	1. Second argumenrs evaluation is optional.                 |
	|                                                   |                                                               |
	|2. Relativelly performance is low.					|	2. Relativally performance is high.                         |
	|                                                   |                                                               |
	|3. Applicable for both boolean and integeral types |	3. Applicable only for boolean but not for integeral types  |
	---------------------------------------------------------------------------------------------------------------------

	
Note: 	 

	x && y => y will be evaluated if and only if x is a true . That is if is false then y won't be evaluated.
	
	x || y => y will be evaluated if and only if false. That is if x is true then y won't be evaluated.
	
	
Ex. 

																		---------------------		
	int x =10, y= 15;													|		|	y  |  x	|	
																		---------------------
	if(++x <10 & ++y>15){                                               |   &   |  11  | 17 |
		                                                                |   &&  |  11  | 16 |
		x++;                                                            |   |   |  12  | 16 |
	}                                                                   |   ||	|  12  | 16 |
	else {                                                              |       |      |    |
																		---------------------		
		y++;
	}
	System.out.println(x+"..."+y);
	
	
Ex. 

		int x =10; 									int x =10; 
		if(++x > && (x/0 >10)){                     if(++x > & (x/0 >10)){
			                                        	
			System.out.println("Hello");            	System.out.println("Hello");
		}											}										
		else{                                       else{
			                                        	
			System.out.println("Hi");               	System.out.println("Hi");
		} //Hi                                      } //RE: ArithmeticException / by Zero 


	- If we replace '&&' with '&' then we will get runtime exception saying ArithmeticException / by zero.


 -------------------------------
	9. type cast operators.
 -------------------------------	
	
	
-> There are two types of type-casting.

	1. Implicit type-casting.
	2. Explicit type-casting.
	
------------------------------	
  1. Implicit type-casting
------------------------------

  -> Compiler is responsible to performe implicit type-casting.

  -> whenever we are assigning smaller data type value to bigger data type variable implicit type-casting will be performed.
  
  -> It is also known as widening or upcasting.

  -> There is no loss of information in these type casting.

  -> The following are variaous possible convertions where implicit type-casting will be performed   
  
			byte--> short|
		    			 |--->int-->float--->double
            		|--->|
            		|
            char---> 
			
			IMPLICIT TYPE-CASTING
  
		Ex. 

		int x 'a'; [compiler converts char to int automatically by implicit type-casting]
		System.out.println(x);//97
		
		double d = 10; [compiler converts int to double automatically by implicit type-casting]
		System.out.println(d);//10.0

---------------------------
 2. Explicit type-casting
---------------------------

 -> Programmer is responsible to performe explicit type-casting.
 
 -> Whenever we are assigning begger data type value to smaller data type variable then explicit type-casting is required.
 
 -> It is also known as narrowing or downcasting.
 
 -> There may be a chance of loss of information in these type casting.
 
 -> The following are variaous possiblity where explicit type-casting is required.
	
		byte<---short|
        			 |<---int-<--float<---double
        		|<---|
        		|
        char<---- 

		EXPLICIT TYPE-CASTING
	
	Ex
	
	int x 	= 130;
	byte b  =  x; //CE: possible loss precision found: int, required: byte.
	
	int x = 130;
	byte b= (byte)x;//valid 
	
	System.out.println(b); //-126 But in these output we loss the information.
	
	
	-> Whenever we are assigning begger data type value to smaller data type variable by explicit type-casting the most significant bit will be lost we have to considard only LSb(
	   list significant bits).
	
	int x =130;						int x =	130 ==> 		0 0 0 0 ......0 10000010
	byte b= (byte)x;				byte b= (byte)x;==>     1	 0 0 0 0 0 1 0 		
	System.out.println(b);			   2|130			    | 		2's complement form	
									  -------			   -ve
									   2|65-0
									  -------	
									   2|32-1	
									  --------						1 1 1 1 1 0 1
									   2|16-0								 +  1
									  --------						-------------
									   2|8-0						1 1 1 1 1 1 0
									 ---------						
									   2|4-0					    
									 ---------	
									   2|2-0						1	 1	 1	 1	 1	  1	  1	
									 ---------						2'6 2'5 2'4 2'3 2'2' 2'1 2'0 = 
									   	|1-0 						 64+32+16+8+4+2+0
																		-126


	Ex. 
	
	
	int x = 150;							int x =150; => 0 000........010010110
	short s = (short)x;						short s = (short)x;==> 0 000...010010110
	System.out.println(s);										   |	------------	
																 +ve 		 |
																			150
	
	
	byte b = (byte)x;						byte b = (byte)x; ==> 1 		0 0 1 0 1 1 0 										
	System.out.println(b);//-106								  |					|
																 -ve		1 1 0 1 0 0 1==> 2's compliment forms 
																					   +1
		 2|150																--------------
	    -------																1 1 0 1 0 1 0 
         2|75-0
        -------	
         2|37-1													  1  1   0   1   0   1   0	 
        --------												2'6 2'5 2'4 2'3 2'2' 2'1 2'0	
         2|18-1													 
        --------												 64+32+ 0+ 8+0+2+0 == -106
         2|9-0	
        --------	
         2|4-1	
        --------	
         2|2-0	
        --------	
          |1-0 	


	Ex. 
	
		- If we assing floating point values to integeral types by explicit type-casting the digits after the decimal point will be lost.
		
		
	
	double  d = 130.456;
	int x = (int)d;
	System.out.println(x); //130
	
	byte b = (byte)d;
	System.out.println(b); //-126







 
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	