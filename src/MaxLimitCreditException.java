import java.math.BigDecimal;

public class MaxLimitCreditException extends CreditSystemException {
    protected BigDecimal allovedLimit;
    protected BigDecimal requestedAmount;

    public MaxLimitCreditException(String message, Customer customer) {
        super(message, customer);
    }

    public MaxLimitCreditException(String message, Customer customer, BigDecimal allovedLimit, BigDecimal requestedAmount) {
        super(message, customer);
        this.allovedLimit = allovedLimit;
        this.requestedAmount = requestedAmount;
    }

    public BigDecimal getAllovedLimit() {
        return allovedLimit;
    }

    public void setAllovedLimit(BigDecimal allovedLimit) {
        this.allovedLimit = allovedLimit;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
}
