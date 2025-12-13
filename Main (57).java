import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   System.out.println("Selling price: ");
	   int s=sc.nextInt();
	   System.out.println("Loss percent: ");
	   double l=sc.nextInt();
	  double losspercent=100-l;
	  double result=(s*100)/(losspercent);
	   System.out.println("Cost price: "+result);
}
}
