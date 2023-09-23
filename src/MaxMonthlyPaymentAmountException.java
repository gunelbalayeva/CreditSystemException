import java.math.BigDecimal;

public class MaxMonthlyPaymentAmountException extends CreditSystemException {
    protected BigDecimal allovedMonthlyAmount;
    protected BigDecimal calcuatedMonthlyAmount;

    public MaxMonthlyPaymentAmountException(String message, Customer customer, BigDecimal allovedMonthlyAmount, BigDecimal calcuatedMonthlyAmount) {
        super(message, customer);
        this.allovedMonthlyAmount = allovedMonthlyAmount;
        this.calcuatedMonthlyAmount = calcuatedMonthlyAmount;
    }

    public MaxMonthlyPaymentAmountException(String message, Customer customer) {
        super(message, customer);
    }

    public BigDecimal getAllovedMonthlyAmount() {
        return allovedMonthlyAmount;
    }

    public void setAllovedMonthlyAmount(BigDecimal allovedMonthlyAmount) {
        this.allovedMonthlyAmount = allovedMonthlyAmount;
    }

    public BigDecimal getCalcuatedMonthlyAmount() {
        return calcuatedMonthlyAmount;
    }

    public void setCalcuatedMonthlyAmount(BigDecimal calcuatedMonthlyAmount) {
        this.calcuatedMonthlyAmount = calcuatedMonthlyAmount;
    }
}
