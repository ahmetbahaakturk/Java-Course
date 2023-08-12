public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBullExamNote(int test1, int quiz1, int test2, int quiz2, int test3, int quiz3) {
        this.c1.test = test1;
        this.c1.quiz = quiz1;

        this.c2.test = test2;
        this.c2.quiz = quiz2;

        this.c3.test = test3;
        this.c3.quiz = quiz3;
    }

    void printNote() {
        System.out.println(c1.name + " Note: " + c1.test);
        System.out.println(c2.name + " Note: " + c2.test);
        System.out.println(c3.name + " Note: " + c3.test);
        System.out.printf("Average: %.2f\n", this.average);
    }

    void isPass() {
        this.average = ((c1.test * 0.8) + (c1.quiz * 0.2) + (c2.test * 0.8) + (c2.quiz * 0.2) + (c3.test * 0.8) + (c3.quiz * 0.2)) / 3.0;
        System.out.println("=============");
        if (this.average > 55) {
            System.out.println("Class Passed!");
        } else {
            System.out.println("Class Failed!");
        }
        printNote();
    }
}