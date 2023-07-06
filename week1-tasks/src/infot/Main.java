package infot;

import java.util.Scanner;

public class Main {

	
	Emp_Service emp = new Emp_Service();
	static boolean ordering=true;
	 public static void menu()
	 {
		 System.out.println("Employe Details"
		 		+ "\n1. Add Emp"
		 		+ "\n2. view Emp"
		 		+ "\n3. update Emp"
		 		+ "\n4. Delete Emp"
		 		+ "\n5. view All Emp"
		 		+ "\n6. Exist ");
			System.out.println();	 	 
		 
	 }
	
	
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp_Service service = new Emp_Service();
	 do {
		 menu();
		 System.out.println("enter your choice");
				 
		 int choice=sc.nextInt();
		 switch (choice) {
		case 1: 
			
			System.out.println("Add Employee");
			service.Add();
			break;
         case 2: 
			
			System.out.println("View Employee");
			service.viewById();
			break;
         case 3: 
 			
			System.out.println("Update Employee");
			service.Update();
			break;
         case 4: 
 			
			System.out.println("Delete Employee");
		  service.Delete();
			break;
		
         case 5: 
 			
			System.out.println("View All Employee");
			service.viewAll();
			break;
         case 6: 
  			
 			System.out.println("Thank you for using application!!");
 		    System.exit(0);
        
 		    default:
 		    	System.out.println("Plese enter the valid choice");
 		    	break;
		}
		 
	 }while(ordering);
	
}
	
}
