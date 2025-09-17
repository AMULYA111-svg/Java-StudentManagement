import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    students.add(new Student(roll, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    System.out.println("\n--- Student List ---");
                    for(Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for(Student s : students) {
                        if(s.rollNo == searchRoll) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 4);
        sc.close();
    }
}
