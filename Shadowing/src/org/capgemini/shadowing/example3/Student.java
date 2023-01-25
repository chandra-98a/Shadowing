package org.capgemini.shadowing.example3;

public class Student {

	//Instance variables
	String name;
	int age;
	double height;

	//Local variables are same as instance variable names
	/* public void setData(String name,int age,double height) {
		 name=name;
		 age=age;
		 height=height;
		 }
		 */
	 

/* Shadowing can be resolved using "this" keyword */
	
	public void setData(String name,int age,double height) {
		 this.name=name;
		 this.age=age;
		 this.height=height;
		 }
}