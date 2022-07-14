import java.util.Scanner;

public class lec_005_02_decimal_2_binary {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number : ");
	int n=sc.nextInt();
	int ans=0,i=0;
	int digit;

	while(n!=0) {
	
			
			digit= n %10;
			if(digit==1) {
				ans=(int)(ans+Math.pow(2,i));
			}
			
			n=n/10;
			i++;
	}
	System.out.println(ans);
	}
}
