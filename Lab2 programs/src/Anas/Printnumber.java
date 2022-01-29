import java.util.Scanner;
public class Printnumber {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter the number:");
	int number = reader.nextInt();
	System.out.println("Entered Number is:" + number);
}
}