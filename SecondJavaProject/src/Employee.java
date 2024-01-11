import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private double basicSalary;
    private ArrayList<Payment> paymentHistory;

    public Employee(int employeeID, String name, String position, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.paymentHistory = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void addPayment(double amount, Date date, String paymentMethod) {
        Payment payment = new Payment(amount, date, paymentMethod);
        paymentHistory.add(payment);
    }

    public ArrayList<Payment> getPaymentHistory() {
        return paymentHistory;
    }
}