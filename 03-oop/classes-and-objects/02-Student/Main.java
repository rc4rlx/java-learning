
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Carl", 20, "College", "Tanauan Institute", "TI2025-0815");
        Student student2 = new Student("Koby", 18, "Senior High School", "Tanauan Institute", "TI2025-0918");
        Student student3 = new Student("Mr Pao", 20, "College", "Tanauan Institute", "TI2025-1010");

        student1.displayInfo();        
        System.out.println();

        student2.displayInfo();        
        System.out.println();
    
        student3.displayInfo();        
        System.out.println();

        student2.greet();
        student1.greet(student2);
        student3.greet(student2);

    }
}
