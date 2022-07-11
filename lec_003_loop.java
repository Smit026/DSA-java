import java.util.Scanner;

public class lec_003_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("a : ");
		int a=sc.nextInt();
		int i=2;int temp=0;
		while(i<=a-1) {
			if(a%i==0) {
				temp++;
			}
			i++;
		}
		if(temp>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
