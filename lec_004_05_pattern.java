import java.util.Scanner;

public class lec_004_05_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		
		int count;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=i;j++) {
				
				System.out.print(count);
				count++;
				
			}
			System.out.println();
		}

	}

}
