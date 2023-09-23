import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditSystem {
    public boolean apply(Customer customer, BigDecimal amount, int duration) throws MaxLimitCreditException, MaxMonthlyPaymentAmountException {
        BigDecimal maxCreditLimit = BigDecimal.valueOf(10).multiply(customer.getSalary());
        System.out.println("max allowed credit limit for the customer: " + maxCreditLimit);
        if (amount.compareTo(maxCreditLimit) > 0) {
            throw new MaxLimitCreditException("Max credit exceded ", customer, maxCreditLimit, amount);
        }

        BigDecimal maxAllowedMonthlyPaymennt = customer.getSalary().multiply(BigDecimal.valueOf(0.7));
        System.out.println("max allowed monthly amount: " + maxAllowedMonthlyPaymennt);
        BigDecimal percent = BigDecimal.valueOf(0.24);
        BigDecimal monthlyFee = amount.multiply(percent).divide(BigDecimal.valueOf(12), RoundingMode.HALF_EVEN);
        BigDecimal monthlyAmount = amount.divide(BigDecimal.valueOf(12), RoundingMode.HALF_EVEN);
        BigDecimal monthlyAmountTotal = monthlyAmount.add(monthlyFee);
        System.out.println("monthly amount: " + monthlyAmount);
        System.out.println("monthly fee: " + monthlyFee);
        System.out.println("monthly total amont: " + monthlyAmountTotal);

        if (monthlyAmount.compareTo(maxAllowedMonthlyPaymennt) > 0) {
            throw new MaxMonthlyPaymentAmountException("max monthly amount exceeded ", customer, maxAllowedMonthlyPaymennt, monthlyAmountTotal);
        }


        return true;
    }
}
