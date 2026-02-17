import java.util.Scanner;

class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int divide(int a, int b){
		return a/b;
	}
	int modulus(int a, int b) {
		return a%b;
	}
}

class CalculatorApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();   //object creation

		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		System.out.println("Enter first number: ");
			int a =  sc.nextInt();

		System.out.println("Enter second number: ");
			int b = sc.nextInt();

		if(choice == 1) {
			System.out.println("Result: "+ calc.add(a,b));
			}
		else if(choice == 2) {
			System.out.print("Result: "+calc.subtract(a,b));
		}

		else if(choice == 3) {
			System.out.print("Result: "+ calc.multiply(a,b));
		}
		
		else if(choice == 4) {
			if(b!=0){
			System.out.println("Result: " + calc.divide(a,b));
			}
			
			else {
				System.out.println("cannot divide with 0");
			}
		}

		else if(choice == 5) {
			System.out.println("Result: " +calc.modulus(a,b));
		}

		else {
			System.out.println("Invalid choice!");
		}

		sc.close();
	}
}
			
			