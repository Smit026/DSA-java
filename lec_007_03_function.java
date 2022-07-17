import java.util.Scanner;

public class lec_007_03_function {
	public static int prime(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n : ");
		int n=sc.nextInt();
		int ans=prime(n);
		if(ans==1) {
		System.out.println("prime");
		}
		else {	
		System.out.println("not prime");
		}
	}
}
