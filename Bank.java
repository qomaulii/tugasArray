public class Bank {

    private Customer[] customers;
    private int numberOfCustomers = 0;

    public Bank() {
        customers = new Customer[20];
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(f, l);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }

        return null;
    }

    public Customer[] getCustomers() {
        return customers;
    }
}