import java.math.BigDecimal;

public class CreditMain {
    public static void main(String[] args) {

        Customer customer = new Customer("Ali ", "Mammedov ", BigDecimal.valueOf(4000));
        CreditSystem creditSystem = new CreditSystem();
        BigDecimal amount = BigDecimal.valueOf(1000);
        int duration = 12;
        System.out.println("customer: " + customer);
        System.out.println("requested amount: " + amount);
        System.out.println("requested duration: " + duration);
        try {
            creditSystem.apply(customer, amount, duration);
            System.out.println("credit ok.");
        } catch (MaxLimitCreditException e) {
            System.out.println("max credit error, max allowed " + e.getAllovedLimit() + "requested " + e.requestedAmount);
            throw new RuntimeException(e);
        } catch (MaxMonthlyPaymentAmountException e) {
            System.out.println("max monthly amount error, monthly allowed " + e.getAllovedMonthlyAmount() + "calculated:" + e.calcuatedMonthlyAmount);
            System.out.println("suggestion-increase duration or decrease amount");
            throw new RuntimeException(e);
        }
    }
}