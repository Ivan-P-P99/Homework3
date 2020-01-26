package HomeWork;

import java.util.ArrayList;

public class TheListt {

	public static void main(String[] args) {
		
		ArrayList<String> Person = new ArrayList<String>();
		Person.add("Pesho is a Student");
		Person.add("Alex is a Student");
		Person.add("Georgi is a Profesor");
		Person.add("Minchu is a RichStudent2");
		Person.add("Sasho is a Student");
		Person.add("Mihaela is a Student");

		int Students = 0;
		int Profesors = 0;
		int RichStudent2 = 0;
		int persons = 0;

		for (String out : Person) {
			if (out.endsWith("Student")) {
				Students++;
			}
			if (out.contains("Profesor")) {
				Profesors++;
			}
			if (out.endsWith("2")) {
				RichStudent2++;
			}
			persons++;
		}
		System.out.println("There are "+ persons + " people");
		System.out.println("There are "+ Profesors + " Profesors");
		System.out.println("There are "+ Students + " Students");
		System.out.println("There are "+ RichStudent2 + " RichStudents");
		
	}

}
