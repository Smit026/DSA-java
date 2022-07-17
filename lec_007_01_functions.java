import java.util.Scanner;

public class lec_007_01_functions {

	public static int even(int a) {
		
		if(a%2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n : ");
		int n=sc.nextInt();
		int ans=n;
		if(ans==even(n))
		System.out.println(ans+" EVEN");
		else {
			System.out.println(ans+" ODD");
		}
	}

}
