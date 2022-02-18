import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		if(M+C < 60) {
			System.out.printf("%d %d",H,M+C);				
		}
		else if(M+C == 60) {
			if(H+1==24) {
				System.out.printf("0 0",H+1);
			}
			else
			System.out.printf("%d 0",H+1);
		}
		else {
			if((H+((M+C)/60))>23){
				System.out.printf("%d %d",H+((M+C)/60)-24,((M+C)%60));
			}
			else
			System.out.printf("%d %d",H+((M+C)/60),((M+C)%60));		
		}	
		
	}
	

}
