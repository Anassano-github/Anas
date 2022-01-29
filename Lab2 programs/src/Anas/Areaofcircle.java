package Anas;
import java.util.Scanner;
public class Areaofcircle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Radius of the Circle : ");
	double radius = scanner.nextDouble();
	double circumference =  Math.PI * radius * radius;
	System.out.println("The Circumferece of the Circle = "+circumference);
}
}