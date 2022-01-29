package Anas;

public class Nestedswitchcase {
public static void main(String[] args) {
	int tech = 1,
	course = 2;
	switch(tech) {
	case 1:
		System.out.println("Python");
		break;
		case 2:
			switch(course) {
			case 1:
				System.out.println("Java");
				break;
			case 2:
				System.out.println("Je6");
				break;
	}
	}
	
}
}
