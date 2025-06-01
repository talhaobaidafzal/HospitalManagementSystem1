package hospitalmanagement;

public class Patient extends Person {
	private String disease;
	private Doctor assignedDoctor;
	
	public Patient(String name, int age, String disease, Doctor doctor) {
		super(name,age);
		this.disease = disease;
		this.assignedDoctor = doctor;
	}
	public Doctor getAssignedDoctor() {
		return assignedDoctor;
	}
    public void displayInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Assigned Doctor: " + assignedDoctor.name);
        System.out.println("Doctor Fees: Rs." + assignedDoctor.getFees());
    }

}
