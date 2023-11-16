
														Operators & Assignments Part-3 || instanceof, bitwise operator
													=====================================================================
													
------------------------------	
	6. instanceof operators
------------------------------

 -> We can use instanceof operator to check whether the given object is of particular type or not.
 
	Ex. 
 
 
	 object o = l.get(0);
	 if(o instanceof Student){
																	------------------
		 Student s = new (Student)o;						l------>|	|	|	|	|
		 //perform student speficic functionality.					-----------------
	 }
		 else if( o instanceof Customer){
			 
			Customer c = (customer)o;
			// perform customer speficic functionality.
			
		 }
		 
 Syntax 

				r 			instanceof 				x 
				|									|
				|									|
			object reference 				class|interface name 					
	

	Ex. 
																					  Object 		
																						  |	 -----Runnable(I)
		Thread t = new Thread();														  | |  	
		System.out.println( t instanceof Thread); //tru									  | |	
		System.out.println( t instanceof Object); //true								Thread 
		System.out.println( t instanceof Runnable);//true 
		
	Ex

		-> To use instanceof operator compulsory there should be some relation between arguments types(Either child to parent or parent to child or same type ) otherwise we will
		   compile time error saying incovertalbe types.
		   


			Thread t = new Thread();
			System.out.println( t instanceof String ); //CE: incovertalbe types : found java.lang.Thread, required: java.lang.String. 
		
			
		
	Note: For any class or interface 'x' null instanceof x is always false.

		
			null instanceof x ; // false 
		
			System.out.println( null instanceof Thread); //false	
	        System.out.println( null instanceof Object); //false
            System.out.println( null instanceof Runnable);//false
			
			
------------------------------------			
  7. bitwise operators (&, |,^).	
------------------------------------

 &-> AND=> Returns true if and only if both arguments are true.
 
 |->OR=>  Returns true if and only if atleast one arguments is true.
 
 ^->X-OR=> Returns true if and only if both arguments are different.
 
	Ex. 

		System.out.println(	true & false); //false 
		System.out.println(	true | false); // true
		System.out.println(	true ^ false); // true


 -> We can apply these operators For integeral types also .
 
	Ex. 
 
	System.out.println(4&5); //4 
		
		100
		101
	----------
		100
		
	System.out.println(4|5); //5 
		
		100
		101
	  --------	
	    101
	System.out.println(4^5); //1
	
		100
		101
	---------	
		001 

-------------------------------------
   Bitwise Complement operator(~)
-------------------------------------


  -> We can apply these operator only for integeral types but not For boolean types. If we are trying to apply for boolean type then we will get compile time error.

		System.out.println(~true);//CE: operator ~ cannot be applied to boolean.
		
		System.out.println(~4);  //valid


		System.out.println(~4); //-5
	
							|--These is most significant bit if it is 0 means positive and it is 1 means negative 	
							|
			4 = 			0 	0 0 0 0 . . . . . 0 1 0 0 
							|					  --------> value	 
					  sign bit 		



			~4 =			1	1 1 1 1 . . . . . 1 0 1 1
						   ------------------------------
									||
							   2's complement form
							
							0   0 0 0 0 . . . . . 0 1 0 0
												+		1
							-------------------------------
							0   0 0 0 0 . . . . . 0  1 0 1 == 5 
				-			------------------------------		
				
							Ans = -5 
						
	-> The most significant bit access sign bit.
	
	-> 0 means positive number and 1 meand negative number.
	
	-> Positive numbers will be repraseneted directly in a memory where as negative number will be repraseneted indirectly in a memory in 2's complement form.
	
	
----------------------------------	
	Boolean complement operator(!)
----------------------------------

 -> We can apply these operator only for boolean type but not for integeral types. 
 
	System.out.println(!4);//CE: operator negation ! cannot applied to int 
	
	System.out.println(!false); //true
	
	


				& |
				| |==> // These 3 operator applicable for both boolean and integeral types 
				^ |


				~ -> Applicable  only for  integeral type but not for boolean type.
				
				! -> Applicable only for boolean but not for integeral types.
































 
	













































  