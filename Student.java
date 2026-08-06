public class Student extends Person{

    int studentID;
    String course;



    Student(String first,String last,int age,String course,int studentID){
        super(first, last, age);
        this.studentID = studentID;
        this.course = course;
    }


    public int getStudentID() {
        return studentID;
    }

    public String getName(){
        return first +" "+last;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }

}
