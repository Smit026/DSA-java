import java.util.Scanner;

public class lec_005_02_decimal_2_binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=sc.nextInt();
		int ans=0,i=0;
		int bit;
	
		while(n!=0) {
		
				
				bit= n & 1;
				ans=(int)(Math.pow(10,i)*bit)+ans;
				
				n=n>>1;
				i++;
		}
		System.out.println(ans);
		}
		
	
		
		
	

}

	
