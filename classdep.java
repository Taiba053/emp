import java.util.*;

class Employee {
    private String username;
    private String dateOfJoining;
    private int departmentId;

    public Employee(String username, String dateOfJoining, int departmentId) {
        this.username = username;
        this.dateOfJoining = dateOfJoining;
        this.departmentId = departmentId;
    }

    public String getUsername() {
        return username;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Employee [Username: " + username + ", Date of Joining: " + dateOfJoining + ", Department ID: " + departmentId + "]";
    }
}

class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department [ID: " + departmentId + ", Name: " + departmentName + "]";
    }
}

public class classdep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter date of joining:");
        String dateOfJoining = scanner.nextLine();

        System.out.println("Enter department ID:");
        int departmentId = scanner.nextInt();

        Department department = new Department(departmentId, "HR");

        Employee employee = new Employee(username, dateOfJoining, departmentId);

        System.out.println("\nEmployee Details:");
        System.out.println(employee);
        System.out.println("\nDepartment Details:");
        System.out.println(department);

        scanner.close();
    }
}
