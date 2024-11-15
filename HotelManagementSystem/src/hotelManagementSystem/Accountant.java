package hotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Accountant extends Employee {
    private List<Invoice> managedInvoices;
    private double totalPayroll;

    public Accountant(String name, int id, String contact, double salary, String job, List<Invoice> managedInvoices, double totalPayroll) {
        super(name, id, contact, salary, job);
        this.managedInvoices = new ArrayList<>();
        this.totalPayroll = totalPayroll;
    }

    public List<Invoice> getManagedInvoices() {
        return managedInvoices;
    }

    public void setManagedInvoices(List<Invoice> managedInvoices) {
        this.managedInvoices = managedInvoices;
    }

    public double getTotalPayroll() {
        return totalPayroll;
    }

    public void setTotalPayroll(double totalPayroll) {
        this.totalPayroll = totalPayroll;
    }

    // Method to generate an invoice for a booking
    public Invoice generateInvoice(Payment payment) {
        Invoice invoice = new Invoice((int) (Math.random() * 1000), null, payment);
        managedInvoices.add(invoice);
        System.out.println("Invoice generated: " + invoice.getInvoiceId());
        return invoice;
    }

 // Method to calculate total payroll
    public void calculatePayroll(List<Employee> employees) {
        totalPayroll = 0;
        for (Employee emp : employees) {
            totalPayroll += emp.getSalary();
        }
        System.out.println("Total payroll calculated: Birr " + totalPayroll);
    }
}