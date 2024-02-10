import java.util.Scanner;

public class emp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Date of Joining (YYYY-MM-DD): ");
        String dateOfJoining = scanner.nextLine();

        System.out.print("Enter Department ID: ");
        int departmentId = scanner.nextInt();

       
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Department ID: " + departmentId);

        
        scanner.close();
    }
}
