package Tool;

public abstract class Tool {
    private final String name;
    private final int price;

    protected Tool(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}