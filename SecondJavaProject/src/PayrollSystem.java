import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {// Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get employee information from the user
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.print("Enter employee basic salary (KWD): ");
        double basicSalary = scanner.nextDouble();

        // Create an instance of Employee with user-provided information
        Employee employee1 = new Employee(employeeID, name, position, basicSalary);

        // Add a payment for the employee
        System.out.print("Enter payment amount (KWD): ");
        double paymentAmount = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter payment method: ");
        String paymentMethod = scanner.nextLine();

        // Add the payment with a fixed date (you can replace this with the desired
        // date)
        Date paymentDate = new Date();
        employee1.addPayment(paymentAmount, paymentDate, paymentMethod);

        // Calculate and print total salary in KWD
        double totalSalary = employee1.getBasicSalary() + paymentAmount;
        NumberFormat kwdFormat = NumberFormat.getCurrencyInstance();
        String formattedTotalSalary = kwdFormat.format(totalSalary);
        System.out.println("Total Salary: " + formattedTotalSalary);

        // Retrieve and display the payment history
        ArrayList<Payment> paymentHistory = employee1.getPaymentHistory();
        System.out.println("Payment History:");
        for (Payment payment : paymentHistory) {
            System.out.println("Date: " + payment.getDate() + ", Amount: " +
                    kwdFormat.format(payment.getAmount()) + ", Method: " + payment.getPaymentMethod());
        }

        // Close the scanner
        scanner.close();
    }
}