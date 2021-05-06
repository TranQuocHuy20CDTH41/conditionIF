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
		/**
		 * cau b
		 */
		int n;
		System.out.println("Nhap gia tri cho n: ");
		n = sc.nextInt();
		if (n % 3 == 0)
			System.out.println("n chia het cho 3");
				if (n % 5 == 0)
					System.out.println("n chia het cho 5");
				else 
					System.out.println("n khong chia het cho 3 va 5");
		/**
		 * cau c
		 */
		int thang, nam;
		System.out.println("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		nam = sc.nextInt();
		switch(thang)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Thang co 31 ngay"); break;
			case 4: case 6: case 9: case 11:
				System.out.println("Thang co 30 ngay"); break;
			case 2:
				if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100!= 0 ))
					System.out.println("Thang co 29 ngay");
				else
					System.out.println("Thang co 28 ngay"); 
				break;
			default:
				System.out.println("Thang khong hop le");
				break;
		}
			/**
			 * cau d
			 */
				int a, b, c;
				float delta, x = 1, x1 = 1, x2 = 1;
				System.out.println("Nhap gia tri cho a = ");
				a = sc.nextInt();
				System.out.println("Nhap gia tri cho b = ");
				b = sc.nextInt();
				System.out.println("Nhap gia tri cho c = ");
				c = sc.nextInt();
				delta = (float)(b*b)-(4*a*c);
				if (delta > 0)
					{
					x1 = (float)((-b) + Math.sqrt (delta))/(2*a);
					x2 = (float)((-b) - Math.sqrt (delta))/(2*a);
					System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+x1 + ";" + "x2 = "+x2);
					}
					if (delta == 0)
						{
						x = (float)(-b/a);
						System.out.println("Phuong trinh co nghiem kep: x = " +x);}
					else 
							System.out.println("Phuong trinh vo nghiem");
				/**
				 * cau e			
				 */
					int canh 1, canh 2, canh 3;
					System.out.println("Nhap vao canh thu nhat cua tam giac: ");
				    float canh1 = sc.nextFloat();
				    
				    System.out.println("Nhap vao canh thu hai cua tam giac");
				    float canh2 = sc.nextFloat();
				    
				    System.out.println("Nhap vao canh thu ba cua tam giac");
				    float canh3 = sc.nextFloat();
				    
				    if((canh1 + canh2>canh3) || (canh2 + canh3 > canh1) || (canh1 + canh3 > canh2)){
				    	System.out.println("ba canh da nhap la ba canh cua tam giac");
				    }		else {
				    		System.out.println("Ba canh da nhap ko phai la ba canh cua tam giac");
				    		}
		}

}
