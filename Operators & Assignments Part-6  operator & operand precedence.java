
											Operators & Assignments Part-6 || operator & operand precedence
									 	     =====================================================================

----------------------------
  14. operator precendence. 
----------------------------

 -> Java operator Precedence.
 
 1. Unary operators:		2. Arithmentic operators:		3. shift operators:  	4. Comparison operators:			5. equality operators:		6. Bitwise Operators:
                                                                                                                                                    
	[], x++,x--             	*,/,%                       	>> , >>>, <<        	<, <=, >, >=, instanceof        			==, !=                  	&
	++x, --X,~,!            	+,-                         	                    	                                                            				^
	new, <type>                                                                                                                                     				|
	
  
7. Short circuti operators:		8. Conditional operators:		9. Assignment operators:
                                                                
	&&                          	?,:                         		=, +=, -=, *=.....
	||
	

--------------------------------------
  15. Evaluation order of operands.
---------------------------------------

 -> In java we have only operator precedence but not operand precedence before applying any operator all operands will be evaluated from left to right. 

	Ex. 
	
		class Test {
			
				public static void main(String args[]) {
					
						System.out.println(m1(1) + m1() * m1(3) /m1((4) + m1(5) * m1(6));
						
				}
			public static int m1(int i) {							output
				                                                    
					System.out.println(i);              1+2*3/4+5*6			1
					return i;                           1+6/4+5*6			2
			}                                                   1+1+5*6			3
		}                                                           1+1+30			4
		                                                            2+30			5	
		                                                            32				6
		
	  	
		
		
		
		
		



	

	
