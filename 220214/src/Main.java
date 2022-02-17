import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
				
		if(num1 > 89 && num1 < 101 ) {
			System.out.println("A");
		}
		else if(num1 > 79 && num1 < 90) {
			System.out.print("B");
		}
		else if(num1 > 69 && num1 < 80) {
			System.out.println("C");
		}
		else if(num1 > 59 && num1 < 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
	}

}
