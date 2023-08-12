public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int test;
    int quiz;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.test = 0;
        this.quiz = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        } else {
            System.out.println("Teacher's Branch Is Not Compatible With The Course");
        }
    }

    void printTeacherInfo() {
        this.teacher.printInfo();
    }
}
