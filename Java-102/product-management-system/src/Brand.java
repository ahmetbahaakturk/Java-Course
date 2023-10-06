import java.util.Scanner;

public class Brand {
    private String name;
    private int id;

    Brand() {
        createBrand();
    }

    Brand(String name) {
        this.name = name;
    }

    public void createBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Brand Name: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
