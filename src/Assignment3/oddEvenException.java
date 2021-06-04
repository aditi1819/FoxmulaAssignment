package Assignment3;
import java.util.*;
//creating a class of our own exception
class oddPrimeException extends Exception{  
	 oddPrimeException(String s){  
	  super(s);  
	 }  
	} 

public class oddEvenException {
//giving our own message to exception 	
	static void validate(int number)throws oddPrimeException{
		//if the number is prime or odd it will create the exception
	     if(number==2 || number%2!=0)
	      //throw keyword to throw an exception
	      throw new oddPrimeException("number is invalid");  
	     else 
	    //rest of the numbers are valid	 
	      System.out.println("number is valid");  
	   }  
	
   public static void main(String []args) {
	   //taking input from user for the number
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number");
	   int n = sc.nextInt();
	   //putting the critical code that may throw exception in try-catch block
	   try {
	   validate(n);
      }catch(Exception m){System.out.println("Exception occured: "+m);}
     
   }
   
	   
}
