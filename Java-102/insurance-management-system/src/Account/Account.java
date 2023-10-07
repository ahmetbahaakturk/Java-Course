package Account;

import java.util.ArrayList;
import java.util.Comparator;

import Input.Input;
import Insurance.*;

public abstract class Account implements Comparable<Account> {
    private final double rate;
    private AuthenticationStatus authenticationStatus;
    private final User user;
    private final ArrayList<Insurance> insurances;

    Account(AuthenticationStatus authenticationStatus, User user, double rate) {
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insurances = new ArrayList<>();
        this.rate = rate;
    }

    public void showInfo() {
        System.out.println(user.toString());
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public int compareTo(Account account) {
        return this.user.getEmail().compareTo(account.user.getEmail());
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }
}