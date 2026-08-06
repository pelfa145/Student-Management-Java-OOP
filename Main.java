
public class Main {
    static InputHandler input = new InputHandler();
    static StudentManager studentMan = new StudentManager();
    public static void main(String[] args) {

    showMenu();

    input.close();
    }
    static void showMenu(){
        int choice;
        do{
            System.out.println("Student Manager 2\n1. Add a student\n2. View students\n3. Exit");
            System.out.print("Input your choice: ");
            choice = input.menuChoice();
            switch(choice){
                case 1 -> input.getInputForAddingStudent(studentMan);
                case 2 -> studentMan.printStudents();
                case 3 -> System.out.println("Bye!");
            }
        }while(choice != 3);
    }
}
