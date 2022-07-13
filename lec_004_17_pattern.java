import java.util.Scanner;

public class lec_004_17_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(count);
				
			}
			count++;
			System.out.println();
		}
	}

}
