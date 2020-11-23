
public class Student implements Cloneable {
	private String nume;
	private String prenume;
	Masina masina;
	
	public Student(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;
	}
	public void setMasina(Masina masina) {
		this.masina = masina;
	}
	public Masina getMasina() {
		return masina;
	}
	public String toString() {
		return "Studentul:" + nume +" " + prenume + " conduce " + masina;
	}
	/*protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
	protected Object clone() throws CloneNotSupportedException {
		Student cloned = (Student)super.clone();
		cloned.setMasina((Masina)cloned.getMasina().clone());
		return cloned;
	}
}
