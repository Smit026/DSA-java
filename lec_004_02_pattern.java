import java.util.Scanner;

public class lec_004_02_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
