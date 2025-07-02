//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public void add(int a, int b){
        int input = a;
        int input2 = b;
        int c = a + b;
        System.out.println(c);
    }
    public void subtract(int a, int b){
        int input = a;
        int input2 = b;
        int d = a - b;
        System.out.println(d);
    }
    public void multiply(int a, int b){
        int input = a;
        int input2 = b;
        int e = a * b;
        System.out.println(e);
    }
    public void division(int a, int b){
        int input = a;
        int input2 = b;
        int f = a / b;
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int input = sc.nextInt();
        System.out.println("Please enter second number");
        int input2 = sc.nextInt();
        Main obj = new Main();
        System.out.println("The sum is: ");
        obj.add(input, input2);
        System.out.println("The subtraction is: ");
        obj.subtract(input, input2);
        System.out.println("The multiplication is: ");
        obj.multiply(input, input2);
        System.out.println("The division is: ");
        obj.division(input, input2);
    }
}