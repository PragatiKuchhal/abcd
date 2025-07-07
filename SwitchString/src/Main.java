//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the color: ");
        String input = sc.nextLine();
        switch(input){
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("WAIT");
                break;
            case "GREEN":
                System.out.println("GO");
                break;
            default:
                System.out.println("Choose the valid color.");


        }
    }
}