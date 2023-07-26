package crudWo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Crud {

	public static ArrayList<Employee> list = new ArrayList<Employee>();
	public static HashSet<Employee> set = new HashSet<>(list);
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number ");

		boolean flag = true;
		while(flag) {
			System.out.println("enter 1 for create employee");
			System.out.println("enter 2 for edit employee");
			System.out.println("enter 3 for delete employee");
			System.out.println("enter 4 for view employee");
			System.out.println("enter 5 for exit");
			System.out.println("enter 6 for sort employee As per age");
			System.out.println("Enter input");
			int number = sc.nextInt();
		
		     if(number ==1) {
		    	
		    	int empid = 0;
		      while(true) {
		    	try {
		    		System.out.println("Enter Employee ID");
		 		 empid = sc.nextInt();
		 		 break;
		 		}
		    	catch (Exception e){
		    		System.out.println("Enter Correct value of Empid");
		    		sc.nextLine();
		    	}
		      }
		 		
		 		String name = " ";
		 		while(true) {
			    	try {
			    		System.out.println("enter emp name");
			 		 name = sc.next();
			 		 break;
			 		}
			    	catch (Exception e){
			    		System.out.println("Enter Correct value of empname");
			    		sc.nextLine();
			    	}
			      }
		 		System.out.println("enter emp skills");
		 		String skills = " ";
		 		while(true) {
			    	try {
			 		 skills = sc.next();
			 		 break;
			 		}
			    	catch (Exception e){
			    		System.out.println("Enter Correct value of skills");
			    		sc.nextLine();
			    	}
			      }
		 		System.out.println("enter emp age");
		 		int age = 0;
		 		
		 		while(true) {
			    	try {
			 		 age = sc.nextInt();
			 		 if(age <=0) {
			 			 System.out.println("age should be greater than 0"); continue;
			 		 }
			 		 break;
			 		}
			    	catch (Exception e){
			    		System.out.println("Enter Correct value of age");
			    		sc.nextLine();
			    	}
			      }
		 		System.out.println("enter emp salary ");
		 		int salary = 0;
		 		while(true) {
			    	try {
			 		 salary = sc.nextInt();
			 		 if(salary <=0) {
			 			System.out.println("salary Should be Greatet than 0"); continue;
			 		 }
			 		 break;
			 		}
			    	catch (Exception e){
			    		System.out.println("Enter Correct value of salary");
			    		sc.nextLine();
			    	}
			      }
		 		System.out.println("enter joining date");
		 		String  joining_date = " ";
		 		Date date1 = null;
		 		while(true) {
			 		try {
				 		joining_date = sc.next();
				 		date1=new SimpleDateFormat("dd/MM/yyyy").parse(joining_date);
				 		break;
			 		}
			 		catch(ParseException tp) {
			 			System.out.println("enter Proper date format in dd/MM/yyyy");
			 		}
		 		}
		 		Employee e = new Employee(empid, name, skills, age, salary, date1);
		    	addEmployee(e);
		     }
		     else if(number ==2) {
		    		System.out.println("Enter Employee ID you want to edit ");
			 		int empid = sc.nextInt();
			 		
			 		Employee e = list.get(empid-1);
			 		
			 		//System.out.println("enter emp name");
			 		String name = " ";
			 		while(true) {
				    	try {
				    		System.out.println("enter emp name");
				 		 name = sc.next();
				 		 break;
				 		}
				    	catch (Exception te){
				    		System.out.println("Enter Correct value of empname");
				    		sc.nextLine();
				    	}
				      }
			 		e.setName(name);
			 		System.out.println("enter emp skills");
			 		String skills = " ";
			 		while(true) {
				    	try {
				 		 skills = sc.next();
				 		 break;
				 		}
				    	catch (Exception te){
				    		System.out.println("Enter Correct value of skills");
				    		sc.nextLine();
				    	}
				      }
			 		e.setSkills(skills);
			 		System.out.println("enter emp age");
			 		int age = 0;
			 		
			 		while(true) {
				    	try {
				 		 age = sc.nextInt();
				 		 if(age <=0) {
				 			 System.out.println("age should be greater than 0"); continue;
				 		 }
				 		 break;
				 		}
				    	catch (Exception te){
				    		System.out.println("Enter Correct value of age");
				    		sc.nextLine();
				    	}
				      }
			 		e.setAge(age);
			 		System.out.println("enter emp salary ");
			 		int salary = 0;
			 		while(true) {
				    	try {
				 		 salary = sc.nextInt();
				 		 if(salary <=0) {
				 			System.out.println("salary Should be Greatet than 0"); continue;
				 		 }
				 		 break;
				 		}
				    	catch (Exception te){
				    		System.out.println("Enter Correct value of salary");
				    		sc.nextLine();
				    	}
				      }
			 		e.setSalary(salary);
			 		System.out.println("enter joining date");
			 		String  joining_date = " ";
			 		Date date1 = null;
			 		while(true) {
				 		try {
					 		joining_date = sc.next();
					 		date1=new SimpleDateFormat("dd/MM/yyyy").parse(joining_date);
					 		break;
				 		}
				 		catch(ParseException tp) {
				 			System.out.println("enter Proper date format in dd/MM/yyyy");
				 		}
			 		}
			 		e.setDateOfJoining(date1);	
		    	    editEmployee();
		    	 
		     }
		     else if(number ==3) {
		    		System.out.println("Enter Employee ID you want to delete ");
			 		int empid = sc.nextInt();
			 		Employee e =list.remove(empid-1);
			 		set.remove(e);
			 		deleteEmployee();
		     }
		     else if(number == 4) {
		    	 viewEmployee();
		     }
		     else if(number == 5) {
		    	 flag = false;
		     }
		     else {
		    	 sortEmployee();
		     }
		}
		sc.close();
			
	}

	private static void sortEmployee() {
		// TODO Auto-generated method stub
        Collections.sort(list, new sortByAge());
        for(Employee l:list) {
			System.out.println(l);
		}
        //System.out.println(list);
		 //System.out.println(set);
	}

	private static void viewEmployee() {
		// TODO Auto-generated method stub
		for(Employee l:list) {
			System.out.println(l);
		}
		//System.out.println(list);
	}

	private static void deleteEmployee() {
		// TODO Auto-generated method stub
		//System.out.println(list);
	}

	private static void editEmployee() {
		// TODO Auto-generated method stub
		//System.out.println(list);
	}

	private static void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		list.add(e);
		//System.out.println(list);
//		for(Employee l:list) {
//			System.out.println(l);
//		}
		set.add(e);
		//System.out.println(e.hashCode());
		//System.out.println(set);
		for(Employee l:set) {
			System.out.println(l);
		}
	}

}
