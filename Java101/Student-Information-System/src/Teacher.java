public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void printInfo() {
        System.out.println("Branch: " + this.branch);
        System.out.println("Name: " + this.name);
        System.out.println("Phone NUmber: " + this.mpno);
    }
}
