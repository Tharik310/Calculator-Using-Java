package calci;
import java.util.Scanner;
public class Cali {
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome");
		int a;
		do {
			Thread.sleep(1000);
			System.out.println("What Operation Do You Want");
			System.out.println("Press 1 To Addition");
			Thread.sleep(500);
			System.out.println("Press 2 To Subraction");
			Thread.sleep(500);
			System.out.println("Press 3 To Multiply");
			Thread.sleep(500);
			System.out.println("Press 4 To Divison");
			Thread.sleep(500);
			System.out.println("Press 5 To Exit");
		    a = s.nextInt();
		    switch(a) {
		    case 1:
		    	System.out.println("Enter The Number 1");
		    	int b = s.nextInt();
		    	System.out.println("Enter The Number 2");
		    	int c = s.nextInt();
		    	System.out.println(b+c);
		    	break;
		    case 2:
		    	System.out.println("Enter The Number 1");
		    	int d = s.nextInt();
		    	System.out.println("Enter The Number 2");
		    	int e = s.nextInt();
		    	System.out.println(d-e);
		    	break;
		    case 3:
		    	System.out.println("Enter The Number 1");
		    	int f = s.nextInt();
		    	System.out.println("Enter The Number 2");
		    	int g = s.nextInt();
		    	System.out.println(f*g);
		    	break;
		    case 4:
		    	System.out.println("Enter The Number 1");
		    	int h = s.nextInt();
		    	System.out.println("Enter The Number 2");
		    	int i = s.nextInt();
		    	System.out.println(h/i);
		    	break;
		    	default:
		    	System.out.println("Thank You");
		    }
	}while(a!=5);
		}
		
		}
