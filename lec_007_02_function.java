import java.util.Scanner;

public class lec_007_02_function {
	public static int fac(int a) {
		int fac=1;
		for(int i=1;i<=a;i++) {
			fac=fac*i;
		}
		return fac;
	}
	public static int cr(int n,int r) {
		int num=fac(n);
		int den=fac(r)*fac(n-r);
		int ans = num/den;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n : ");
	
		int n=sc.nextInt();
		System.out.println("enter r : ");
		int r=sc.nextInt();
		int ans=cr(n,r);
		System.out.println("ans :"+ans);
	}

}
