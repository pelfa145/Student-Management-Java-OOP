public class Student extends Person {

    private final int studentID;
    private String course;

    public Student(String first, String last, int age, String course, int studentID) {
        super(first, last, age);
        this.studentID = studentID;
        this.course = course;
    }

    //getter methods
    public int getStudentID() {
        return studentID;
    }
    public String getName() {
        return first + " " + last;
    }
    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }
    public String getFirst(){return first;}

    //setter methods
    public void setName(String[] fName) {
        if (fName.length > 2) {
            this.first = fName[0] + " " + fName[1];
            this.last = fName[fName.length - 1];
        } else if (fName.length < 2) {
            this.first = fName[0];
            this.last = "no last name";
        } else {
            this.first = fName[0];
            this.last = fName[1];
        }
    }
    public void setAge(int newAge){this.age = newAge;}
    public void setCourse(String newCourse){this.course = newCourse;}

}


