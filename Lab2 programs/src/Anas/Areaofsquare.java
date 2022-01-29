package Anas;
import java.util.Scanner;
public class Areaofsquare {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the side of the square : ");
	double side = scanner.nextDouble();
	double area =  side * side;
	System.out.println("Area of Square = "+area);
}
}