import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int employeeLevel;
        double basicSalary = 0;
        double allowancePercentage = 0;
        double totalSalary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee level(1 - 4): ");
        employeeLevel = sc.nextInt();

        switch(employeeLevel){
            case 1:
                basicSalary = 50000;
                allowancePercentage = 0.30;
                break;
            case 2:
                basicSalary = 43000;
                allowancePercentage = 0.25;
                break;
            case 3:
                basicSalary = 30000;
                allowancePercentage = 0.20;
                break;
            case 4:
                basicSalary = 20000;
                allowancePercentage = 0.15;
                break;
            default:
                System.out.println("Employee level is not valid");
        }

        totalSalary = basicSalary + (basicSalary * allowancePercentage);
        System.out.println("Total salary is: " + totalSalary);
    }
}
