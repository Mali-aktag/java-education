import java.util.Scanner;

public class Banka {

	public static void paraYatir(int a, int b) {
		a = a+b;
		System.out.println("Yeni bakiyeniz. " +a);
		
	}
	
	public static void paraCek(int a, int b) {
		if (b>a) {
				System.out.println("Bakiyeniz yetersiz. İşlem gerçekleşmedi.");
		} else {
			a= a-b;
			System.out.println("İşlem gerçekleşti. Yeni bakiye :" +a);
		}
	}
	
	public static void bakiyeGoster(int a) {
		System.out.println("Bakiye :" +a);
	}
	public static void main(String[] args) {
		System.out.println("Lütfen başlangıç bakiyenizi giriniz");
		Banka kullanici = new Banka();
		Scanner sc = new Scanner(System.in);
		int bakiye = sc.nextInt();
		
		System.out.println("Lütfen yapmak istenilen işlemi giriniz :");
		System.out.println("1. Para Yatır - 2. Para Çek - 3. Bakiye Göster");
		int islem =sc.nextInt();
		
		if(islem ==1) {
			System.out.println("Lütfen yatıracağınız para miktarını giriniz:");
			int ypara = sc.nextInt();
			kullanici.paraYatir(bakiye,ypara);	
		} else if(islem ==2) {
			System.out.println("Lütfen çekeceğiniz para miktarını giriniz:");
			int cpara = sc.nextInt();
			kullanici.paraCek(bakiye,cpara);	
		} else {
			kullanici.bakiyeGoster(bakiye);
			
		}
	}

}
