import java.util.Scanner;

public class lec_002_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("n : ");
		int n=sc.nextInt();
		int i=1;
		
	while(i<=n) {
			System.out.println(i);
			i++;
		}
		int j=1;
		int sum=0;
		while(j<=n) {
			
			sum=sum+j;
			j++;
		}
		System.out.println("sum : "+sum);
		
		int k=2;
		int even=0;
		while(k<=n) {
			even=even+k;
			k=k+2;
		}
		System.out.println("sum of even :"+even);
	}

}
