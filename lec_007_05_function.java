import java.util.Scanner;

public class lec_007_05_function {
	
	public static int bd(int x) {
		int ans=0,i=0,count=0;
		while(x!=0) {
			int bit= x & 1;
			ans=(int)(Math.pow(10,i)*bit)+ans;
			
			x=x>>1;
			i++;
			if(bit==1)
			count++;
		}
		return count;
		
	}
	public static int bd2(int x) {
		int ans=0,i=0,count=0;
		while(x!=0) {
			int bit= x & 1;
			ans=(int)(Math.pow(10,i)*bit)+ans;
			if(bit==1)
				count++;
			x=x>>1;
			i++;
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a : ");
		int a=sc.nextInt();
		System.out.println("enter b : ");
		int b=sc.nextInt();
		
		System.out.println("Number of set bits : "+(bd2(b)+bd(a)));
		
	}

}
