package com.shivangi.core;
import java.util.Scanner;
import com.shivangi.service.studentService;
import com.shivangi.exception.ExceptionController;
Public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
		int ch;		
		System.out.println("---------------------------------------");
		System.out.println("Exception Handling without using AspectJ ");
		System.out.println("---------------------------------------");
		studentService StudentService = new studentService();
		do 
			{
			System.out.println("1)Add Student");
			System.out.println("2)Update Student Information");
			System.out.println("3)Delete Student");
			System.out.println("4)Update Student Contact");
			System.out.println("5) Exit");
			System.out.print("\n Enter your choice:");
			ch = s.nextInt();
			switch(ch) 
			{
			case 1: System.out.println("Checking Exception in addition of student");
					try 
					{
					StudentService.addStudent(); 
					throw new RuntimeException("Exception addStudent");
					}
					catch(Exception e) 
					{
						System.out.println("Exception="+e.getMessage());
						System.out.println("Exception= "+e);
					}
					break;
			case 2: System.out.println("Checking Exception in updation of student's Information");
					try 
					{
						StudentService.updateStudentInfo(); 
						throw new RuntimeException("Exception updateStudentInfo");
					}
					catch(Exception ex) 
					{
						System.out.println("Exception="+ex.getMessage());
						System.out.println("Exception= "+ex);
					}
					break;
			case 3:	System.out.println("Checking Exception in deletion of student's Information");
					try
					{
						StudentService.deleteStudent();
					}
					catch(Exception ex)
					{
						System.out.println("Exception = "+ex.getMessage());
						System.out.println("Exception= "+ex);
					}
					break;	
			case 4: System.out.println("Checking Exception in updation of student's Contact");
					try 
					{
						StudentService.updateContact(); 
						throw new RuntimeException("Exception updateContact");
					}
					catch(Exception ex) 
					{
						System.out.println("Exception="+ex.getMessage());
						System.out.println("Exception= "+ex);
					}
					break;			
			case 5: System.exit(0);
			}
		}
		while(true);
    }
}



















