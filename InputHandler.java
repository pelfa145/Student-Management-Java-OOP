import java.util.Scanner;

public class InputHandler {
    static Scanner input = new Scanner(System.in);

    //

    public void close() {
        input.close();
    }

    public int returnInt() {
        int integer = input.nextInt();
        input.nextLine();
        return integer;
    }
    public String[] returnName(){
        return input.nextLine().split(" ");
    }
    public String returnString(){
        return input.nextLine();
    }
}
