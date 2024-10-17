/*Uçak adında bir public sınıf oluşturun 
 * ve  uçağın koltuklarından 
 * sadece 5 boş koltuk olduğunu 
 * belirten bir ifade yazın.  
 * Uçak Dolu mu, Koltuk Sat, 
 * Uçak durumunu göster adında üç metod 
 * yazarak bunu kullanın. 
 */

import java.util.Scanner;

public class Ucak {
	public int bosKoltuk =5;
	public int doluKoltuk =50;
	
	public void KoltukSat() {
		System.out.println("Ne kadar koltuk satın alacaksınız?");
		Scanner sc = new Scanner(System.in);
		int skoltuk = sc.nextInt();
		
		if(skoltuk>bosKoltuk) {
			System.out.println("Yer yok. Boş koltuk:" +bosKoltuk);
		} else {
			bosKoltuk = bosKoltuk - skoltuk;
			doluKoltuk = doluKoltuk + skoltuk ;
			System.out.println("İşlem gerçekleşti. Boş Koltuk:" +bosKoltuk 
					+ "Dolu Koltuk : " +doluKoltuk);
		}
	}
		
	public void UcakDurumunuGoster() {
		System.out.println("Dolu Koltuk: " +doluKoltuk + "Boş Koltuk:" +bosKoltuk);
	
		
	}
	public static void main(String[] args) {
		Ucak ucak = new Ucak();
		
		ucak.UcakDurumunuGoster();
		ucak.KoltukSat();
		ucak.UcakDurumunuGoster();
		ucak.KoltukSat();

	}

}
