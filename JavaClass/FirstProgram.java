import java.util.Scanner;

public class FirstProgram {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String input = sc.nextLine();
	System.out.println(input);
	System.out.println("Please enter your rollno: ");
	long input2 = sc.nextLong();
	System.out.println(input2);
 }
}