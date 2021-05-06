package basic.dev;
/**
 * lab 06
 * @author ADMIN
 *Cau a
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho a: ");
		a = sc.nextInt();
		if ( a > 0 )
			System.out.println("a la so nguyen duong");
		else System.out.println("a la so nguyen am");
		}

}
