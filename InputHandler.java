import java.util.Scanner;

public class InputHandler {
    static Scanner input = new Scanner(System.in);

    public void getInputForAddingStudent(StudentManager studentMan) {
        System.out.print("Input students name: ");
        String[] fName = input.nextLine().split(" ");
        String first= "";
        String last = "";
        if (fName.length > 2) {
            first = fName[0] + " " + fName[1];
            last = fName[2];
        } else if (fName.length < 2) {
            first = fName[0];
            last = "no last name";
        } else {
            first = fName[0];
            last = fName[1];
        }
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        if (age < 0 | age > 100) {
            System.out.println("You can't exceed age limit 😭 be fr.");
        }
        System.out.print("Enter your college course ex. BSIT/BS Nursing/BS Crim: ");
        String course = input.nextLine();
        int studentid = 0;
        if (studentMan.students.isEmpty()) {
            studentid = 2026000;
        } else{
            int lastStudentID = studentMan.students.getLast().getStudentID();
            studentid = lastStudentID + 1;

        }
        studentMan.students.add(new Student(first, last, age, course, studentid));
    }
    public void close(){
        input.close();
    }

    public int menuChoice() {
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}
