package Account;

public class Enterprise extends Account {
    public static final double rate = 1.50;

    public Enterprise(AuthenticationStatus authenticationStatus, User user) {
        super(authenticationStatus, user, rate);
    }
}
