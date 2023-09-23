public class CreditSystemException extends Exception {
    protected Customer customer;

    public CreditSystemException(String message, Customer customer) {
        super(message);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
