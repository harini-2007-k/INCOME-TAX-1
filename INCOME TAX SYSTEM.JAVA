import java.util.Scanner;

public class IncomeTaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary, otherIncome, totalIncome;
        double deductions, taxableIncome, tax = 0;

        // Input Section
        System.out.print("Enter Salary Income: ");
        salary = sc.nextDouble();

        System.out.print("Enter Other Income: ");
        otherIncome = sc.nextDouble();

        System.out.print("Enter Total Deductions: ");
        deductions = sc.nextDouble();

        // Processing Section
        totalIncome = salary + otherIncome;
        taxableIncome = totalIncome - deductions;

        if (taxableIncome < 0) {
            taxableIncome = 0;
        }

        // Tax Calculation (Example Slabs)
        if (taxableIncome <= 250000) {
            tax = 0;
        }
        else if (taxableIncome <= 500000) {
            tax = (taxableIncome - 250000) * 0.05;
        }
        else if (taxableIncome <= 1000000) {
            tax = (250000 * 0.05)
                + (taxableIncome - 500000) * 0.20;
        }
        else {
            tax = (250000 * 0.05)
                + (500000 * 0.20)
                + (taxableIncome - 1000000) * 0.30;
        }

        // Output Section
        System.out.println("\n----- TAX DETAILS -----");
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Deductions: " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax Payable: " + tax);

        sc.close();
    }
}