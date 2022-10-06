import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

 
 
		public static void main(String[] args){ 

			
			 Scanner sc= new Scanner(System.in); 
			
			System.out.print("Enter how many friends: "); 
			int numOfFriends = Integer.parseInt(sc.nextLine()); 
	 
			String arrayOfNames[] = new String[numOfFriends]; 
			for (int i = 0; i < arrayOfNames.length; i++) { 
				System.out.print("Person " + (i+1) + " : "); 
					arrayOfNames[i] = sc.nextLine(); 
					
			} 
				 
			for (int i = 0; i < arrayOfNames.length; i++) { 
				System.out.print("The inputed person " + (i+1) + " : "); 
					System.out.print(arrayOfNames[i] + "\n"); 
			} 

		
			
			}
		}
	 
				 
	 
	
	 


	 