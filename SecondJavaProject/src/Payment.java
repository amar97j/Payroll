import java.util.Date;

public class Payment {
    private double amount;
    private Date date;
    private String paymentMethod;

    public Payment(double amount, Date date, String paymentMethod) {
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}