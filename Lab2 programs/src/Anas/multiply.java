package Anas;
import java.util.Scanner;
public class multiply {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of i" );
	int i = scan.nextInt();
	System.out.println("enter the value of j" );
	int j = scan.nextInt();
	int k= i*j;
	System.out.println("Multiplication of the entered values = " +k);
}
}