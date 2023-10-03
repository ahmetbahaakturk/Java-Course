import java.util.*;

public class Category {
    private int id;
    private final LinkedList<Product> products;
    private String name;
    private final LinkedList<String> specs;

    Category() {
        this.products = new LinkedList<>();
        this.specs = new LinkedList<>();
        this.specs.add("ID");
        this.specs.add("Brand");
        this.specs.add("Product Name");
        this.specs.add("Price");
        this.specs.add("Stock");
        createCategory();
    }

    private void createCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("New Category Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Specific Specs of The Category(Ram, Screen Size etc.) Press Q to Save Specs");
        while (true) {
            String preference = scanner.nextLine();
            if (preference.equals("q") || preference.equals("Q")) {
                break;
            } else {
                this.specs.add(preference);
            }
        }
    }

    public void printProducts() {
        reIdProducts();

        for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
        System.out.println("=====");
        System.out.format("| %-3s", specs.get(0));
        for (int i = 1; i < specs.size(); i++) System.out.format("| %-17s", specs.get(i));
        System.out.println();
        for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
        System.out.println("=====");
        for (Product product : products) {
            System.out.format("| %-3s", product.getSpecValues().get(0));
            for (int i = 1; i < product.getSpecValues().size() - 1; i++) {
                System.out.format("| %-17s", product.getSpecValues().get(i));
            }
            System.out.println();
        }
        for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
        System.out.println("=====");
    }

    public void reIdProducts() {
        int i = 0;
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getSpecValues().get(2).compareTo(o2.getSpecValues().get(2));
            }
        });

        for (Product product : products) {
            product.getSpecValues().set(0, String.valueOf(++i));
        }
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public LinkedList<String> getSpecs() {
        return specs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}