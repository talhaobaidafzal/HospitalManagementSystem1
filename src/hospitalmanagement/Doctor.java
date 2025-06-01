package hospitalmanagement;

public class Doctor extends Person {
	private String specialization;
	private double fees;
	
	public Doctor(String name, int age, String specialization, double fees) {
		super(name, age);
		this.specialization = specialization;
        this.fees = fees;
	}
    public String getSpecialization() {
        return specialization;
    }
    public double getFees() {
        return fees;
    }
    
    public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Fees: Rs." + fees);
    }
}
