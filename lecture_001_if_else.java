import java.util.*;
public class lecture_001_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("a : ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("A is positive");
		}else {
			System.out.println("A is negative");
		}
		System.out.println("b :");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
		System.out.println("enter letter : ");
		char c=sc.next().charAt(0);
		if(c>='a' &&c<='z') {
			System.out.println("LOWER CASE");	
		}else if(c>='A' && c<='z') {
			System.out.println("Upper Case");
		}else {
			System.out.println("Number");
		}
		//hw
		
	}

}
