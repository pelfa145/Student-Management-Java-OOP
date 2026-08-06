import java.util.ArrayList;
public class StudentManager {
    public ArrayList<Student> students = new ArrayList<>();


    public void printStudents(){
        System.out.println("NAME|AGE|COURSE|ID");
        for(Student i : students){
            System.out.println(i.getName()+"|"+i.getAge()+"|"+i.getCourse()+"|"+i.getStudentID());
        }
    }
}
