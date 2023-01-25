package org.capgemini.shadowing.example1;

public class Student {
	//Instance variables
String name;
int age;
double height;

//Local variables
 public void setData(String name,int age,double height) {
	 name=name;
	 age=age;
	 height=height;
 }
}
/* Here Instance Variable names and Local Variables names are same and
 * the priority is given to local variables This cause-->SHADOWING
 */