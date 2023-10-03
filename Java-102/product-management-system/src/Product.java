import java.util.*;

public class Product {
    private final LinkedList<String> specValues;
    private Brand brand;

    Product(LinkedList<String> specs, LinkedList<Brand> brands) {
        this.specValues = new LinkedList<>();
        specValues.add(null);
        specValues.add(null);
        createProduct(specs, brands);
    }

    private void createProduct(LinkedList<String> specs, LinkedList<Brand> brands) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Brands----------");
        for (Brand brand1 : brands) {
            System.out.println(brand1.getId() + ". " + brand1.getName());
        }

        System.out.print("Select Brand ID: ");
        int id = Input.input() - 1;
        this.brand = brands.get(id);
        this.specValues.set(1, brands.get(id).getName());

        for (int i = 2; i < specs.size(); i++) {
            System.out.print(specs.get(i) + ": ");
            this.specValues.add(scanner.nextLine());
        }
    }

    public LinkedList<String> getSpecValues() {
        return specValues;
    }
}