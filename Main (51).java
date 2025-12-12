import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   System.out.println("Total candies: ");
	   int t=sc.nextInt();
	   System.out.println("Number of peoples: ");
	   int n=sc.nextInt();
	   int result=t/n;
	   System.out.println("Candies per person: "+result);
}
}
