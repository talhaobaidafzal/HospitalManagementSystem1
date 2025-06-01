package hospitalmanagement;
import java.util.*;

public class Hospital {
		private ArrayList<Doctor> doctors = new ArrayList<>();
		private ArrayList<Patient> patients = new ArrayList<>();
		private Scanner sc = new Scanner(System.in);
		
		public void addDoctor() {
			System.out.println("Enter Doctor Name: ");
			String name = sc.nextLine();
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt(); sc.nextLine();
	        System.out.print("Enter Specialization: ");
	        String spec = sc.nextLine();
	        System.out.print("Enter Fees: ");
	        double fees = sc.nextDouble(); sc.nextLine();
	        
	        Doctor d = new Doctor(name, age, spec, fees);
	        doctors.add(d);
	        System.out.println("Doctor added.\n");
		}
		
		public void addPatient() {
	        if (doctors.isEmpty()) {
	            System.out.println("Add at least one doctor first.");
	            return;
	        }
	        System.out.print("Enter Patient Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt(); sc.nextLine();
	        System.out.print("Enter Disease: ");
	        String disease = sc.nextLine();
	        
	        System.out.println("Available Doctors:");
	        for (int i = 0; i < doctors.size(); i++) {
	            System.out.println(i + 1 + ". " + doctors.get(i).name + " - " + doctors.get(i).getSpecialization());
	        }
	        
	        System.out.print("Choose Doctor (by number): ");
	        int docIndex = sc.nextInt() - 1; sc.nextLine();
	        
	        Patient p = new Patient(name, age, disease, doctors.get(docIndex));
	        patients.add(p);
	        System.out.println("Patient added.\n");

		}
	    public void viewDoctors() {
            System.out.println("\n-----------Doctors-----------");
	        for (Doctor d : doctors) {
	            d.displayInfo();
	            System.out.println("----------------------");
	        }
	    }
	    
	    public void viewPatients() {
            System.out.println("\n-----------Patients-----------");
	        for (Patient p : patients) {
	            p.displayInfo();
	            System.out.println("----------------------");
	        }
	    }
		
		
}
