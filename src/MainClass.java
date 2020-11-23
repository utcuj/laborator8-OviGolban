import java.awt.Color;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student1 = new Student("Popescu", "Andrei");
		Masina masina1 = new Masina("Audi", Color.black);
		student1.setMasina(masina1);
		System.out.println(student1.toString());

		// studentul clonat cu shallow copy
		/*
		 * Student cloned1 = (Student) student1.clone();
		 * System.out.println(cloned1.toString());
		 * cloned1.getMasina().setCuloare(Color.red);
		 * 
		 * System.out.println("\nValorile dupa actualizare:(shallow copy):");
		 * System.out.println(student1.toString());
		 * System.out.println(cloned1.toString());
		 */

		Student cloned2 = (Student) student1.clone();
		cloned2.getMasina().setCuloare(Color.blue);

		System.out.println("\nValorile dupa actualizare:(deep copy):");
		System.out.println(student1.toString());
		System.out.println(cloned2.toString());

	}

}
