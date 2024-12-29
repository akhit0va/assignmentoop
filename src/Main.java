public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", 20, true);
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);

        Student student2 = new Student("Jane", "Smith", 22, false);
        student2.addGrade(78);
        student2.addGrade(82);
        student2.addGrade(95);

        Teacher teacher1 = new Teacher("Alice", "Johnson", 40, false, "Mathematics", 12, 50000);
        Teacher teacher2 = new Teacher("Bob", "Brown", 35, true, "Physics", 8, 45000);

        teacher1.giveRaise(10);

        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println(school);

        System.out.println("Student 1 GPA: " + student1.calculateGPA());
        System.out.println("Student 2 GPA: " + student2.calculateGPA());
    }
}