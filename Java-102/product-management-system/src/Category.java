import java.util.*;

public class Category {
    private int id;
    private final LinkedList<Product> products;
    private String name;
    private final LinkedList<String> specs;
    private final LinkedList<Product> filteredProducts = new LinkedList<>();

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

        boolean cont = true;
        while (cont) {
            for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
            System.out.println("=====");
            System.out.format("| %-3s", specs.get(0));
            for (int i = 1; i < specs.size(); i++) System.out.format("| %-17s", specs.get(i));
            System.out.println();
            for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
            System.out.println("=====");

            for (Product product : filteredProducts) {
                System.out.format("| %-3s", product.getSpecValues().get(0));
                for (int i = 1; i < product.getSpecValues().size(); i++) {
                    System.out.format("| %-17s", product.getSpecValues().get(i));
                }
                System.out.println();
            }
            for (int i = 0; i < specs.size() - 1; i++) System.out.print("==================");
            System.out.println("=====");
            cont = searchSettings();
        }
    }

    public boolean searchSettings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-List by Id\n2-Filter by Id\nQ-Back\nEnter: ");
        while (true) {
            String preference = scanner.nextLine().toLowerCase();
            switch (preference) {
                case "1" -> {
                    reIdProducts();
                    return true;
                }
                case "2" -> {
                    filterProductsId();
                    return true;
                }
                case "q" -> {
                    return false;
                }
                default -> System.out.print("Enter Valid Value: ");
            }
        }
    }

    private void filterProductsId() {
        filteredProducts.clear();

        System.out.print("Min Id: ");
        int minId = Input.input();
        System.out.print("Max Id: ");
        int maxId = Input.input();

        for(Product product : products) {
            int productId = product.getId();
            if((productId >= minId) && (productId <= maxId)) {
                filteredProducts.add(product);
            }
        }
    }

    public void reIdProducts() {
        filteredProducts.clear();
        int i = 0;
        products.sort(Comparator.comparing(o -> o.getSpecValues().get(2)));

        for (Product product : products) {
            product.getSpecValues().set(0, String.valueOf(++i));
        }
        filteredProducts.addAll(products);
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