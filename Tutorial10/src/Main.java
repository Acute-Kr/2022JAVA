import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("������",27,177,89,"2015",4,4);
		student1.show();
		Teacher teacher1 = new Teacher("������",27,177,89,"2015",3000000,5);
		teacher1.show();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Է¹��� �������� �� : ");
		int number = scan.nextInt();
		
		Teacher[] teachers = new Teacher[number];
		
		for (int i = 0; i < number; i++) {
			
			System.out.println("���� �̸���? : ");
			String name = scan.next();
			System.out.println("���� ���̴�? : ");
			int age = scan.nextInt();
			System.out.println("���� Ű��? : ");
			int Height = scan.nextInt();
			System.out.println("���� �����Դ�? : ");
			int Weight = scan.nextInt();
			System.out.println("������ ��ȣ��? : ");
			String TeacherId = scan.next();
			System.out.println("���� ������? : ");
			int MonthSalary = scan.nextInt();
			System.out.println("���� ������? : ");
			int WorkedYear = scan.nextInt();
			
			Teacher teacher = new Teacher (name,age,Height,Weight,TeacherId,MonthSalary,WorkedYear);
			teachers[i] = teacher;
			
		}
		
		for (int i = 0; i < number; i++) {
			
			teachers[i].show();
		}
	}

}
