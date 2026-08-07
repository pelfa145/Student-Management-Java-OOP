import java.util.ArrayList;

public class StudentManager {
    static InputHandler input = new InputHandler();
    public ArrayList<Student> students = new ArrayList<>();


    public void printStudents() {
        System.out.println("NAME|AGE|COURSE|ID");
        for (Student i : students) {
            System.out.println(i.getName() + "|" + i.getAge() + "|" + i.getCourse() + "|" + i.getStudentID());
        }
    }

    public int deleteStudent() {
        int index = searchStudent();
        if (index == -1) {
            return -1;
        } else {
            System.out.println("Removed: " + students.get(index).getName());
            students.remove(index);
        }
        return 0;
    }

    public int searchStudent() {
        System.out.print("Enter student ID: ");
        int studentID = input.returnInt();
        for (int i = 0; i < students.size(); i++) {
            Student j = students.get(i);
            if (j.getStudentID() == studentID) {
                System.out.println("Found! at " + i + "!");
                return i;
            }
        }
        System.out.println("No student was found with student ID of "+studentID+".");
        return -1;
    }
    public int addStudent() {
        System.out.print("Input students name: ");
        String[] fName = input.returnName();
        String first = "";
        String last = "";
        if (fName.length > 2) {
            first = fName[0] + " " + fName[1];
            last = fName[fName.length - 1];
        } else if (fName.length < 2) {
            first = fName[0];
            last = "no last name";
        } else {
            first = fName[0];
            last = fName[1];
        }
        System.out.print("Enter your age: ");
        int age = input.returnInt();
        if (age < 0 || age > 100) {
            System.out.println("You can't exceed age limit 😭 be fr.");
            return -1;
        }
        System.out.print("Enter your college course ex. BSIT/BS Nursing/BS Crim: ");
        String course = input.returnString();
        int studentid;
        if (students.isEmpty()) {
            studentid = 2026000;
        } else {
            int lastStudentID = students.getLast().getStudentID();
            studentid = lastStudentID + 1;

        }
        students.add(new Student(first, last, age, course, studentid));
        System.out.println("Added "+first+" to students.");
        return 0;
    }
}