import java.util.*;

public class InClass1210 {

	//the order matters when catching exceptions. You can't go from specific to general here
	//first check the specific ones first --> go from runtime errors to specific errors
	//comment out each exception and then find the order that it goes in


	//12.10 ( OutOfMemoryError ) Write a program that causes the JVM to throw an OutOfMemoryErrorand catches and handles this error.
		  public static void main(String[] args) { 
			  ArrayList<String> infinte = new ArrayList<String>();
			  try {while (true) { 
				  infinte.add ("String add in "); 
			  }  
			  }
			  catch (OutOfMemoryError Out_of_Memory_Error){
				  System.out.println("This created an out of memory error for adding in too many  elements into your array");
			  }
			  }
		    /*try {
		     /* method();
		      System.out.println("After the method call");   
		    }   
		    /*catch (ArithmeticException ex) { 
		      System.out.println("ArithmeticException"); 
		    }*/  
		    /*catch (RuntimeException ex) { 
		      System.out.println("RuntimeException");   
		    }   
		    /*catch (Exception e) {
		      System.out.println("Exception");  
		    }   */
		  }
