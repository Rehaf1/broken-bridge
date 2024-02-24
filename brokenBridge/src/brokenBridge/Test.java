package brokenBridge;

import java.util.*;

public class Test {
	
static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
     System.out.println( "----Welcome to broken Bridge Prison---- ");
     int choise ;
     do {
    	 System.out.println("please select the number of the choise :");
    	 System.out.println("1-vistor ");
    	 System.out.println("2-staff memeber");
    	 System.out.println("3-Exit");
    	  choise = input.nextInt();
    	  
    	  switch(choise) {
    	  case 1 : 
    		  
    		  break;
    	  case 2:
    		  System.out.println("Enter the the number of the choise :");
    		  System.out.println("1-Add Prisoner");
    		  System.out.println("2-Remove Prisoner\n3-return back ");
    		  int ch = input.nextInt();
    		  switch (ch) {
    		  
    		  case 1 :
    			System.out.println(" Enter the details of the prisoner :");
    			  System.out.print("name :");
    			  String name = input.nextLine();
    			  input.nextLine();
    			  System.out.print("ID: ");
    			  String id = input.nextLine();
    			  System.out.print("Crime type:");
    			  String type = input.nextLine();
    			  System.out.print("Serial number:");
    			  String serialNumber = input.nextLine();
    			  System.out.print("Time due:");
    			  int time = input.nextInt();
    			  System.out.print("Cell number :");
    			  String cellNum = input.nextLine();
    			  input.nextLine();
    			  System.out.print("Number of strikes");
    			  int strikes = input.nextInt();
    			  ;
    			  Person obj = new Prisoner (name, id , type , serialNumber , time , cellNum , strikes);
    			  obj.addPrisoner(obj);
    			  break;
    		  case 2 : 
    		 
    		  } // switch ch
    		  
    	  } // switch choise
    	 
    	 	
    	 	
     }while (choise != 3);
     System.out.println("Exitted from the program");
      
	}//main

}
