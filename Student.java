public class Student {
    String name;
    String rollno;
    String grade;

    void stData(String name, String rollno, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }

    void displayData() {
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();
        stud1.stData("John", "123", "A");
        stud2.stData("Jane", "456", "B");
        stud3.stData("inic", "123", "a++");
        stud1.displayData();
        stud2.displayData();
        stud3.displayData();
    }
}
