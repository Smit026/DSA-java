import java.util.Scanner;

public class lec_006_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount : ");
		int n=sc.nextInt();
		int a=1;
		switch(a) {
		case 1: a=n/100;
					System.out.println("100 : "+a);
					n=n-a*100;
		case 2: int b=n/50;
					System.out.println("50 : "+b);
					n=n-b*50;
		case 3: int c=n/20;
				System.out.println("20 : "+c);
				n=n-c*20;
		case 4: int d=n/1;
				System.out.println("1 : "+d);
				n=n-d*1;
		}
	}

}
