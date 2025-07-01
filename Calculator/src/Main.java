//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    int a = 5;
    int b = 4;
    public void add(){
        int c = a + b;
        System.out.println(c);
    }
    public void subtract(){
        int d = a - b;
        System.out.println(d);
    }
    public void multiply(){
        int e = a * b;
        System.out.println(e);
    }
    public void division(){
        int f = a / b;
        System.out.println(f);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number: 7");
//      String input = sc.nextLine();
//        int input = sc.nextInt();
//        System.out.println(input);
        Main obj = new Main();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.division();
    }
}