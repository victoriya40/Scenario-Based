import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   System.out.println("Number of trays: ");
	   int n=sc.nextInt();
	   System.out.println("cakes in each tray: ");
	   int c=sc.nextInt();
	   int result=n*c;
	   System.out.println("Total number of cakes: "+result);
}
}
