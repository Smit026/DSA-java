import java.util.Scanner;

public class lec_004_14_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int k=i;k<=n;k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	
	}

}
