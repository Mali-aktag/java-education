/* Lamba adında bir public sınıf oluşturun 
 * ve lambanın ilk durumunun kapalı 
 * olduğunu belirtin.  Lamba Aç, Lamba Kapat, 
 * Lambanın durumunu Goster adında üç metod tanımlayarak 
 * bu metodları kullandığınız bir örnek yazın.
*/

public class Lamba {
	boolean lambaAcikmi = false;
	
	public void LambaAc() {
		lambaAcikmi = true;
		System.out.println("Lamba açık");
	}
	
	public void LambaKapa() {
		lambaAcikmi = false;
		System.out.println("Lamba kapalı");
	}
	
	public void LambaDurumuGoster() {
		if (lambaAcikmi== true) {
			System.out.println("Açık");
		} else {
			System.out.println("Kapalı");
		}
		
	}
	
	public static void main(String[] args) {
		
		Lamba lamba = new Lamba();
		

		lamba.LambaDurumuGoster();
		lamba.LambaAc();
		lamba.LambaDurumuGoster();
		lamba.LambaKapa();
		lamba.LambaDurumuGoster();
	}

}
