
public class Student {
    private String name;
    private int age;
    private String grade;
    private String schoolName;
    private String studentID;
    private Student otherStudent;

    public Student(String name, int age, String grade, String schoolName, String studentID) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.schoolName = schoolName;
        this.studentID = studentID;
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Grade      : " + grade);
        System.out.println("School Name: " + schoolName);
        System.out.println("Student ID : " + studentID);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void greet(){
        System.out.println(this.name + ": " + "Hello, my name is " + name + " and I am in grade " + grade + ".");
    }

    public void greet(Student otherStudent){
        System.out.println(this.name + ": " + "Hello " + otherStudent.getName() + ", my name is " + this.name + ".");
    }
}
