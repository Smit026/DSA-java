import java.util.Scanner;

public class lec_004_21_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		int c,q;
		for(int i=1;i<=n;i++) {
			c=1;
			for(int j=i;j<=n;j++) {
				
				System.out.print(c);
				c++;
			}
			
			for(int k=1;k<i;k++) {
				System.out.print("*");
				
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
				
			}
			q=n-i+1;
			for(int j=i;j<=n;j++) {
				
				System.out.print(q);
				q--;
			}
			
			System.out.println();
		}
	}

}
