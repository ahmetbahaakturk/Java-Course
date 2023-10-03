import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LinkedList<Category> categories = new LinkedList<>();
    private static final LinkedList<Brand> brands = new LinkedList<>();

    public static void main(String[] args) {
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Xiaomi"));

        menu();
    }

    public static void menu() {
        menu:
        while (true) {
            reIdAllList();
            System.out.print("""


                    1-Show Categories
                    2-Add Brand
                    3-Delete Brand
                    4-Add Category
                    5-Delete Category
                    6-Add Product
                    7-Delete Product
                    Q-Quit System
                    Enter:\s""");
            String preference = scanner.nextLine();

            switch (preference.toLowerCase()) {
                case "1" -> showCategories();
                case "2" -> brands.add(new Brand());
                case "3" -> deleteBrand();
                case "4" -> categories.add(new Category());
                case "5" -> deleteCategory();
                case "6" -> addProduct();
                case "7" -> deleteProduct();
                case "q" -> {
                    break menu;
                }
                default -> System.out.print("Invalid Character!!!");
            }
        }
    }

    public static void showCategories() {
        int i = 0;
        for (Category category : categories) {
            System.out.println(++i + ". " + category.getName());
        }
        System.out.println("Q. Back to Menu");

        System.out.print("Enter Option: ");
        String preference = scanner.nextLine().toLowerCase();
        if (!preference.equals("q")) categories.get(Integer.parseInt(preference) - 1).printProducts();
    }

    public static void addProduct() {
        System.out.print("----------Categories----------\n");
        for (Category category : categories) {
            System.out.println((category.getId()) + "-" + category.getName());
        }
        System.out.print("Select Category Id: ");
        int id = Input.input() - 1;
        Category productCategory = categories.get(id);
        categories.get(id).addProduct(new Product(productCategory.getSpecs(), brands));
    }

    public static void reIdAllList() {
        int i = 0;
        brands.sort(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Brand brand1 : brands) brand1.setId(++i);

        i = 0;
        categories.sort(new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Category category : categories) {
            category.setId(++i);
        }
    }

    public static void deleteBrand() {
        for(Brand brand : brands) System.out.println(brand.getId() + "-" + brand.getName());
        System.out.print("Select: ");
        int index = Input.input() - 1;
        brands.remove(index);
    }

    public static void deleteCategory() {
        for(Category category : categories) System.out.println(category.getId() + "-" + category.getName());
        System.out.print("Select: ");
        int index = Input.input() - 1;
        categories.remove(index);
    }

    public static void deleteProduct() {
        for(Category category : categories) System.out.println(category.getId() + "-" + category.getName());
        System.out.print("Select Product's Category: ");
        int categoryIndex = Input.input() - 1;

        for(Product product : categories.get(categoryIndex).getProducts()) System.out.println(product.getSpecValues().get(0) + "-" + product.getSpecValues().get(2));
        System.out.print("Select to Delete Product: ");
        int productIndex = Input.input() - 1;
        categories.get(categoryIndex).getProducts().remove(productIndex);
    }
}