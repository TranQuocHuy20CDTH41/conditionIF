package basic.dev;
/**
 * lab06
 * Cau b
 */
import java.util.Scanner;
public class MainAppB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho n: ");
		n = sc.nextInt();
		if (n % 3 == 0)
			System.out.println("n chia het cho 3");
				if (n % 5 == 0)
					System.out.println("n chia het cho 5");
				else 
					System.out.println("n khong chia het cho 3 va 5");
	}

}
