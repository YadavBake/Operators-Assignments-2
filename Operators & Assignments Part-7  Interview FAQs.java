
											Operators & Assignments Part-7 || Interview FAQs
								   		     ======================================================

--------------------------- 
 16. new vs newInstance(). 
---------------------------

-> We can use 'new' operator to create an object If we know class name at the beagining.

	Ex. 

	Test     t = new Test();
	Student  s = new Student();
	Customer c = new Customer();
 
 -> newInstance is method prasent in 'class Class '. We can use newInstance() method create object If we don't know class name at the beagining end it is available dynamically at 
	runtime.
	
	Ex.
 
	class Student {
		
	}
	class Customer{
		
	}
	
	class Test {
		
			public static void main(String args[]) throws Exception {
				
				Obeject o = Class.forName(args[0]).newInstance();
					  		---------------------
									|
									|--> // class Class Object

				System.out.println("Object created for"+o.getClass().getName());
			}
	} //o/p
		
	java Test Student 
		Object create for Studnet 
	java Test Customer 
		Object create for Customer 
	java Test java.lang.String
		Object created for java.lang.String 
		

 -> In the case 'new' operator based on our requirment we can invoke any constructor.
 
	Ex.

	Test t = new Test();
	Test t1 = new Test(10);
	Test t2 = new Test("durga");
	
 -> But newInstance() method internally calls no-argument constructor. Hance a to use newInstance() method compulsory currosponding should contain no-argument constructor. 
	otherwise we will get runtime exception saying: InstantiationExcetion.
	
	Ex.
	
	.newInstance()
	{
		
		no-arg
		
	}
	
 -> While using 'new' operator at runtime if the currosponding .class file is not available then we will get Runtime Exception saying: NoClassDefFoundError:Test.

	Ex. 
	
		Test t = new Test();
	
	- At runtime if Test.class file is not available then we will get Runtime exception saying: NoClassDefFoundError:Test
		//RE: NoClassDefFoundError:Test 


-> While using newInstance() method at runtime if the currosponding .class file not available we will get runtime exception saying: ClassNotFoundException.

	Ex.

	Object o = Class.forName(args[0]).newInstance();
	
	
		java Test Test123
	
		- At runtime If Test123 .class file is not available then we will get runtime exception saying: ClassNotFoundException:Test123.
		
			// RE: ClassNotFoundException



	Differences between new and newInstance
==============================================
	
	--------------------------------------------------------------------------------------------------------------------------------
	|			 new 				|						newInstance		|
	---------------------------------------------------------------------------------------------------------------------------------
	|1. It is operator in java 				|1. 	It is a method prasent in java.lan.Class		        |
	|                                                       |                                                                       |
	|2. We can use new operator to create object if		|2. We can use these method to create object if we dont know            |
	|	we know at the beagining.			|   class name at beagining and it is available dynamically             |
	|							|   at runtime.		                                                |
	|                                                       |                                                                       |
	|3. To use new operator class not required to		|3. To use newInstance() method compulsory class should                 |
	|	containe no-arg constructor.			|   contain no-arg constructor otherwise we will get                    |
	|							|   Runtime exception InstantiationException.                           |
	|                                                       |                                                                       |
	|4. At runtime if .class file not available 		|4. At runtime if the currosponding .class file not available then we   |
	|	then we will get runtime exception saying	|   will get runtime exception saying ClassNotFoundException.           |
	|	NoClassDefFoundError. which is unchecked        |     Which is checked.                                                 |
	|                                                       |                                                                       |
	---------------------------------------------------------------------------------------------------------------------------------
	

----------------------------------------------------------------
 Differences  ClassNotFoundException and  NoClassDefFoundError.
---------------------------------------------------------------- 

-> For hard coded class names, at runtime if the currosponding .class file is not available then we will get runtime exception saying NoClassDefFoundError, which is unchecked.

	Ex. 
	
			Test t = new Test();
			
			- At  Runtime if Test.class file is not available then we will get runtime exception saying : NoClassDefFoundError:Test.

-> For Dynamically provided class names at runtime if the currosponding .class file is not available then we will get runtime exception saying ClassNotFoundException, which 
	checked exception.

	Ex. 
	
		Object o = Class.forName(args[0]).newInstance();
		
		java Test Student

		- At Runtime if Student.class file not available then we will get runtime exception saying: ClassNotFoundException:Student.


-------------------------------------------------
 Differences between instanceof and isInstance().
-------------------------------------------------

 -> instanceof is an operator in java. 
 
 -> We can use instanceof to check whether the given object is of particular type of or not and we know the type at beagining. 
 
	Ex. 
 
	Thread t = new Thread();
	System.out.println( t instanceof Runnable);
	System.out.println( t instanceof Object);

-> isInstance() is a method prasent in java.lang.Class.

-> We can use isInstance() method to check whether the given object is of particular type or not and we don't know the type at beagining and it is available dynamically at 
   runtime.  

	Ex.

	class Test {
		
		public static void main(String args[]) throws Exception  {
			
			Thread t = new Thread();
			System.out.println(Class.forName(args[0]).isInstance(t);			
		}
	}
	
	java Test Runnable
	
		true 
	
	java Test String 
	
		false

  -> isInstance() method is a method eqeuvelant of instanceof of operator.













































































		
		
