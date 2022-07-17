import java.util.Scanner;

public class lec_007_06_function {
	static void  fibo(int n) {
		int a=0,b=1;
		int c=0;
	
		for(int i=0;i<=n;i++) {		
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.print(" last digit : "+c);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a : ");
		int a=sc.nextInt();
		fibo(a);
		
	}

}
