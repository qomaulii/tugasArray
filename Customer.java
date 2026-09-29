public class Customer {

    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    public Account getAccount(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < numberOfAccounts) {
            return accounts[accountIndex];
        }

        return null;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}