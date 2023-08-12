public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "HIST", "+905518745213");
        Teacher t2 = new Teacher("Graham Bell", "PHYS", "+905518746713");
        Teacher t3 = new Teacher("Selena", "MATH", "+905518745213");

        Course history = new Course("History", "101", "HIST");
        history.addTeacher(t1);

        Course physics = new Course("Physics", "101", "PHYS");
        physics.addTeacher(t2);

        Course math = new Course("Math", "101", "MATH");
        math.addTeacher(t3);

        Student s1 = new Student("Kerem", "142", "4", history, physics, math);
        s1.addBullExamNote(14, 52, 12, 53, 23, 12);
        s1.isPass();

        Student s2 = new Student("Baha", "132", "2", history, physics, math);
        s1.addBullExamNote(100, 100, 100, 100, 28, 100);
        s1.isPass();

        Student s3 = new Student("Kerem", "142", "4", history, physics, math);
        s1.addBullExamNote(74, 54, 45, 98, 23, 60);
        s1.isPass();

    }
}