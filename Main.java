
public class Main {
    static InputHandler input = new InputHandler();
    static StudentManager studentManager = new StudentManager();
    public static void main(String[] args) {

    showMenu();

    input.close();
    }
    static void showMenu(){
        int choice;
        do{
            System.out.println("Student Manager 2\n1. Add a student\n2. View students\n3. Delete Student\n4. Exit");
            System.out.print("Input your choice: ");
            choice = input.returnInt();
            switch(choice){
                case 1 -> {
                    while(studentManager.addStudent() == -1){
                        System.out.println("Try again.");
                    }
                }
                case 2 -> studentManager.printStudents();
                case 3 -> studentManager.deleteStudent();
                case 4 -> System.out.println("Bye!");
            }
        }while(choice != 4);
    }
}
