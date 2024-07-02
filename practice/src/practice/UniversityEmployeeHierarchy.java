package practice;

public class UniversityEmployeeHierarchy  {
	public static void main(String[] args) {
        // Creating a Faculty object
        Faculty facultyMember = new Faculty("F001", "Dr. John Smith", 80000);
        System.out.println("Faculty Member Details:");
        facultyMember.displayDetails();

        // Creating a Staff object
        Staff staffMember = new Staff("S001", "Jane Doe", 50000);
        System.out.println("\nStaff Member Details:");
        staffMember.displayDetails();
    }
}
