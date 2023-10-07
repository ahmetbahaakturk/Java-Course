package Address;

public class BusinessAddress implements Address {
    private final String name;
    private final String address;

    public BusinessAddress(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(Business Address)" + "\n" + address;
    }
}
