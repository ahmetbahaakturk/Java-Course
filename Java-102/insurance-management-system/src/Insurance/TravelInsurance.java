package Insurance;

import Account.Account;

public class TravelInsurance extends Insurance {
    private static final double rate = 2.30;

    public TravelInsurance(Account account) {
        super(account, "Travel Insurance", rate);
    }
}
