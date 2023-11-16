

													Operators & Assignments Part-2 || Concatenation,Relational,equality
												==========================================================================

--------------------------------------
   String Concatenation Operator(+)											
--------------------------------------

 -> The only overloaded operator in java is '+' operator sometimes it access arithmetic addition operator or sometime it access String concatenation operator.
 
		Ex. 
		
		10+20=30
		"ab"+"cd"=abcd

->  If at list one argument is string type then plus '+' operator access concatenation operator and If both arguments are number type then '+' plus operator access arithmetic 
	addition operator.

		Ex. 

		String a = "Durga";
		int b =10, c = 20, d = 30;
		
		System.out.println(a+b+c+d); // durga102030
		
			 a+b + c+d
			 durga10+c+d
			 durga1020+d
			  durga102030
		
		System.out.println(b+c+d+a); //60durga 
		
			10+20+30+durga = 60durga
			
			
		System.out.println(b+c+a+d); // 30durga30
		System.out.println(b+a+c+d); // 10durga2030
		
->  cosidard the following declarations ? 

	Ex 2. 
	
		String a = "Durga";
		int b =10, c = 20, d = 30;
		
		- Which of the following expression are valid ? 
		
			a = b+c+d; // CE: incompatible type found: int required: java.lang.String 		
			a = a+b+c; // valid 		
			b = a+c+d; // CE: incompatible type found: java.lang.String required: int 			
			b = b+c+d; // valid 		


--------------------------------------
	Relational Operators (<,<=,>,>=)
--------------------------------------

 -> We can apply relational operators for every primitive type except boolean.

		Ex. 
		
		System.out.println(10<20); //true 
		System.out.println('a'<10); // false 
		System.out.println('a'<97.6); // true  
		System.out.println('a'<'A'); // true  
		System.out.println(true>false); // CE: operator greater then can not be applied to boolean, to boolean. 
		
		
-> We can't apply relational operators  for object types.

		Ex.


		System.out.println("durga123"> "durga"); // invalid CE: operator greater then can not be applied to java.lang.String , java.lang.String

->  Nesting of relational operators is not allowed. otherwise we will get compile time error.

	Ex. 
	
	System.out.println(10<20); //true 
	
	
	System.out.println(10<20<30); //CE: operator less then can not be applied to boolean, int
							|
						true <30 

-------------------------------
   Equality Operators (==,!=)
-------------------------------

 -> we can apply equality operators for every primitive type including boolean type also. 
 
	Ex. 
 
	System.out.println(10==20); //false 
	System.out.println('a'=='b'); //false 
	System.out.println('a'<97.0); //true  
	System.out.println(false==false); // true 
	

-> We can apply equality operator for object types also. For object references r1, r2.

-> r1==r2 return true if and only if both references pointing to the same object(reference compairision or address compairision).


		r1 			r2 
		|			 |	
		|			 |---	
		|	--------	|
		-->| object|<---|
		   ---------
		
		r1== r2 true 

	
	
	Thread t1 = new Thread()
	Thread t2 = new Thread()						t1 			t3 						r2 			 
	Thread t3= t1;                                  |			 |	                    |				
	System.out.println(t1==t2); //false             |			 |---                   |			 
	System.out.println(t1==t3); //true 	            |	--------	|                   |	--------	
                                                    -->| object|<---|                   -->| object|
                                                       ---------                           ---------

 -> If we apply equality operators for object types then compulsory there should be some relation between argument types (Either child to parent or parent to child or same tpye)
	otherwie we will get compile time error saying compairable types java.lang.String and java.lang.Thread.
 
	
	Ex.
	
	Thread t = new Thread();					t 					o 					s 							
	Object o = new Object();			        |				    |			        |			
	String s = new String("Durga");			    |			        |			        |			
	System.out.println(t==o); // false          |	--------        |	--------        |	--------
	System.out.println(o==s); //false           -->| 		|        -->| object|        -->| DURGA |
													---------           ---------           ---------
	
	System.out.println(s==t); //CE: Incompairable type: java.lang.String and java.lang.Thread.


-> What is difference between double equal(==) operator and dot equals (.equals()) method ? 

	
	- In general we can use double equal(==) operator for reference compairision(address compairision) and .equals() method for content compairision.
	
	String s1 = new String("Durga");								s1 					s2 			
	String s2 = new String("Durga");                                |			        |			
	System.out.println(s1==s2); //FALSE                             |			        |			
	System.out.println(s1.equals(s2)); //TRUE                       |	--------        |	--------
	                                                                 -->| DURGA|        -->| DURGA |
                                                                        ---------           ---------


Note: For object reference 'r', r==null is always false .

	- But null == null is always true.
	
	Ex
	
	String s = new String("Durga");				String s = null;							System.out.println(null==null); //true  	
	System.out.println(s==null); //false        System.out.println(s==null); // true 
	
	
	
	
	


			
		
	
 