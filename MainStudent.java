import java.util.Scanner;
public class MainStudent {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Student_Pineda student = new Student_Pineda();
        System.out.println("Entering Student Details");
        System.out.print("Enter Student Number: ");
        student.setStudentNum(input.nextInt()); input.nextLine();
        System.out.print("Enter Student Name: ");
        student.setName(input.nextLine());
        System.out.println("Enter your course based on the following:");
        System.out.println("[CS] - Computer Science");
        System.out.println("[EMC] - Entertainment and Multimedia Computing");
        System.out.println("[NETAD] - IT Network Administration");
        System.out.println("[WEBDEV] - IT Web Development");
        System.out.print("Enter Course: ");
        student.setCourse(input.nextLine());
        System.out.print("Enter Number of Units Enrolled: ");
        student.setUnits(input.nextInt());
        System.out.println("Displaying Student Details: ");
        student.display();
        
    }
}
