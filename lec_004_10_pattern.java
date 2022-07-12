import java.util.Scanner;

public class lec_004_10_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("N : ");
		int n=sc.nextInt();
		
		char a='A';
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				
				System.out.print((char)(a+i+j-2));
				
				
			}
			System.out.println();
		    
		    
		}
	}

}
