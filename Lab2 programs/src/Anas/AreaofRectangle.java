package Anas;
import java.util.Scanner;
public class AreaofRectangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the lenght of the Rectangle : ");
	double length = scanner.nextDouble();
	System.out.println("Enter the width of the Rectangle : ");
	double width = scanner.nextDouble();
	double area = length * width;
	System.out.println("Area of Rectangle = "+area);
}
}
