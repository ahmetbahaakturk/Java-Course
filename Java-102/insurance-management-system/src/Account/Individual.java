package Account;

public class Individual extends Account {
    public static final double rate = 1.15;

    public Individual(AuthenticationStatus authenticationStatus, User user) {
        super(authenticationStatus, user, rate);
    }
}
