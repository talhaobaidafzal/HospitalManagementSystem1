package hospitalmanagement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n---- Hospital Management System ----");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); sc.nextLine();
            
            switch (choice) {
            case 1 -> hospital.addDoctor();
            case 2 -> hospital.addPatient();
            case 3 -> hospital.viewDoctors();
            case 4 -> hospital.viewPatients();
            case 0 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice.");
        }
	}
        while (choice != 0);
    }
}
