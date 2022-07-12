import java.util.Scanner;

public class lec_004_11_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		
		char a='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.println();
			a++;
		}
		char b='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(b);
				b++;
			}
			System.out.println();
			
		}
	}

}
