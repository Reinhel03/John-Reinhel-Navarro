import java.util.Scanner;
public class LabExer1B
{
public static void main (String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int x = scan.nextInt();
	showNumberPlus10(x);
	showNumberPlus100(x);
	showNumberPlus1000(x);
	
}
public static void showNumberPlus10(int x){
int a = 10 + x;
System.out.println(x + " plus 10 is " + a);	
}
public static void showNumberPlus100(int x){
int a = 100 + x;
System.out.println(x + " plus 100 is " + a);	
}
public static void showNumberPlus1000(int x){
int a = 1000 + x;
System.out.println(x + " plus 1000 is " + a);	
}
}
