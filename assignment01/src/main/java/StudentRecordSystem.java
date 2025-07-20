import java.util.Scanner;

public class StudentRecordSystem {

    // Maximum student count
    static final int MAX_STUDENTS = 100;

    // Parallel arrays for storing student data
    static String[] names = new String[MAX_STUDENTS];
    static int[] rolls = new int[MAX_STUDENTS];
    static int[] marks = new int[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Main menu loop
        do {
            System.out.println("\n==== Student Record System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit Program");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    // Q2: Method to add a student
    public static void addStudent(Scanner sc) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Cannot add more students. Limit reached.");
            return;
        }

        sc.nextLine(); // Clear input buffer

        System.out.print("Enter Student Name: ");
        names[studentCount] = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rolls[studentCount] = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks[studentCount] = sc.nextInt();

        studentCount++;
        System.out.println("Student added successfully!");
    }

    // Q3: Method to view all students
    public static void viewAll() {
        if (studentCount == 0) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n-- Student List --");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
        }
    }

    // Q4: Method to search a student by roll number
    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number to search: ");
        int searchRoll = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (rolls[i] == searchRoll) {
                System.out.println("Student found!");
                System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}

