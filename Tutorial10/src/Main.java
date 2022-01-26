import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("이재준",27,177,89,"2015",4,4);
		student1.show();
		Teacher teacher1 = new Teacher("이재준",27,177,89,"2015",3000000,5);
		teacher1.show();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력받을 선생님의 수 : ");
		int number = scan.nextInt();
		
		Teacher[] teachers = new Teacher[number];
		
		for (int i = 0; i < number; i++) {
			
			System.out.println("교사 이름은? : ");
			String name = scan.next();
			System.out.println("교사 나이는? : ");
			int age = scan.nextInt();
			System.out.println("교사 키는? : ");
			int Height = scan.nextInt();
			System.out.println("교사 몸무게는? : ");
			int Weight = scan.nextInt();
			System.out.println("교직원 번호는? : ");
			String TeacherId = scan.next();
			System.out.println("교사 월급은? : ");
			int MonthSalary = scan.nextInt();
			System.out.println("교사 연차는? : ");
			int WorkedYear = scan.nextInt();
			
			Teacher teacher = new Teacher (name,age,Height,Weight,TeacherId,MonthSalary,WorkedYear);
			teachers[i] = teacher;
			
		}
		
		for (int i = 0; i < number; i++) {
			
			teachers[i].show();
		}
	}

}
