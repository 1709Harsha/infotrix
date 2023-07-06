package infot;

import java.util.HashSet;
import java.util.Scanner;

public class Emp_Service {

	HashSet<Emp_data> data = new HashSet<Emp_data>();
	
	Emp_data emp1 = new Emp_data(111, "Harsha A B", 21, "IT", "Devloper", 25000);
	Emp_data emp2= new Emp_data(222, "Abhi", 28, "IT", "Tester", 15000);
	Emp_data emp3 = new Emp_data(333, "Shivu", 24, "TL", "Data Science", 55000);

	Scanner scanner=new Scanner(System.in);
    boolean found=false;
	 
     int id;
	 String name;
	 int age;
	 String job_roll;
	 String Dept;
	 double salary;
	
	 public Emp_Service()
	 {
		 data.add(emp1);
		 data.add(emp2);
		 data.add(emp3);
	 }
	
	 //view All employee
	 
	public void viewAll()
	{
		for(Emp_data emp :data)
		{
			System.out.println(emp);
		}
	}
	
	 // view Employee  based on there id
	 
    public void viewById()
    {
   	 System.err.println("Enter id: ");
   			 
   	 id=scanner.nextInt();
   	 for(Emp_data emp:data)
   	 {
   		 if(emp.getId()==id)
   		 {
   			 System.out.println(emp);
   			 found=true;
   		 }
   	 }
   	 if(!found) {
   	 System.out.println("Employee id is not Present"+"\n");
    }
	
}
    
    //Update the employee
    public void Update()
    {
    	System.out.println("Enter id: ");
    	id =scanner.nextInt();
    	boolean found=false;
    	for(Emp_data emp:data)
    	{
    		if(emp.getId()==id) {
    			System.out.println("Enter name:");
    			name=scanner.next();
    			System.out.println("Enter new salary");
    			salary=scanner.nextDouble();
    			System.out.println("Enter new Age");
    			age=scanner.nextInt();
    			System.out.println("Enter new job_roll");
    			job_roll =scanner.next();
    			System.out.println("Enter new Dept");
                Dept=scanner.next();

    			emp.setName(name);
    			emp.setSalary(salary);
    			emp.setAge(age);
    			emp.setDept(Dept);
    			emp.setJob_roll(job_roll);
    			System.out.println("Update Details of Employee are: ");
    			System.out.println(emp);
    			found=true;
    		}
    	}
    	if(!found) {
    		System.out.println("Employee is not present"+"\n");
    	}
    	else
    	{
    		System.out.println("Employee deatils updated Successfully !!"+"\n");
    	}
    }
    
    
    //Delete Employee By Id
    
   public void Delete()
   {
	   System.out.println("Enter id: ");
	   id=scanner.nextInt();
	   boolean found=false;
	   Emp_data empdelete =null;
	   for(Emp_data emp :data)
	   {
		   if(emp.getId()==id) {
			   empdelete =emp;
			   found=true;
		   }
	   }
	   if(!found) {
		   System.out.println("Employee is not present"+"\n");
	   }
	   else {
		   data.remove(empdelete);
		   System.out.println("Employee data is Deleted sucessufully"+"\n");
	   }
   }
    
   //Add Employee
   
   public void Add()
   {
	   System.out.println("Enter Id: ");
	   id=scanner.nextInt();
	   System.out.println("Enter name: ");
	   name=scanner.next();
	   System.out.println("Enter age: ");
        age=scanner.nextInt();
 	   System.out.println("Enter job_roll: ");
 	   job_roll=scanner.next();
	   System.out.println("Enter Dept: ");
        Dept=scanner.next();
 	   System.out.println("Enter salary: ");
        salary=scanner.nextDouble();
        
        Emp_data emp=new Emp_data(id, name, age, job_roll, Dept, salary);
        
        data.add(emp);
        System.out.println(emp);
        System.out.println("Employee addes successfully"+"\n");


   }
   
   
}