package org.capgemini.shadowing.example2;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating an object
		Student s1=new Student();
		//passing parameters to setData method 
		s1.setData("Rama", 20, 5.0);
		//getting name ,age ,height
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
	}

}


/* without shadowing*/
//Results in Rama,20,5.0