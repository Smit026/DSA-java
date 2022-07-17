import java.util.Scanner;

public class lec_007_04_function {
	public static int ap(int a) {
		int A_P=3*a+7;
		return A_P;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n : ");
		int n=sc.nextInt();
		System.out.println(ap(n));
	}

}
