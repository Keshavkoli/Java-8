package com.constructormethodreference;

public class ConstructorMethodReference {

	public static void main(String[] args) {

		/*
		 * ConstructorReference obj = () -> { StudentConstructor std = new
		 * StudentConstructor(); return std; }; obj.getStudent();
		 */

		// ConstructorReference obj = () -> new StudentConstructor();
		ConstructorReference obj1 = StudentConstructor::new;
		obj1.getStudent();

		// ConstructorReference obj = ()->new StudentConstructor();
		// obj.getStudent();

		/*
		 * StudentConstructor obj1 = () -> new StudentConstructor(); obj1.getStudent();
		 */
		/*
		 * ConstructorReference obj1 = () -> {StudentConstructor std1 = new
		 * StudentConstructor();
		 * 
		 * return std1; }; obj1.getStudent("name"); }
		 */

	}
}
