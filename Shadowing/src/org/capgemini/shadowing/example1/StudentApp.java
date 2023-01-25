package org.capgemini.shadowing.example1;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    s1.setData("Rama", 20, 5.0);
    
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.height);
 // This will result in {null ,0 ,0.0}
    //Because of shadowing
	}

}
