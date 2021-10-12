package com.shivangi.service;
import org.springframework.stereotype.Controller;
@Controller
public class studentService {
	public String addStudent() 
	{	
		System.out.println("Add Student");
			String name = null;
			name.toLowerCase();
		return "Student Shivangi information is added successfully";		
	}
	public String updateStudentInfo() 
	{		
			int [] m= {54,65,87};
			int n=0;
			for(int i=0;i<3;i++)
			{
				n = n+m[i];
			}
			float k=n/0;
		return"Student Shivangi's information udated successfully";		
	}
	public void deleteStudent()
	{
		String[] names = new String[0]; 
		String name = names[0]; 
		System.out.println(name);
	}
	public String updateContact() 
	{
			int []Contact = {9,8,1,1,2,3,4,5,5,6};
			int j = 0;
			for(int i=0;i<10;i++)
			{
				j = j+Contact[i];
			}
		return "Student Shivangi contact is added successfully";		
	}
}



