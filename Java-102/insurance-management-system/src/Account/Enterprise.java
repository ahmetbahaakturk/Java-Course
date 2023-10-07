package Account;

public class Enterprise extends Account {
    public static final double rate = 1.50;

    public Enterprise(User user) {
        super(user, rate);
    }
}
