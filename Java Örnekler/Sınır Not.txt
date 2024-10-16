import java.util.Scanner;

public class Not {
	
	    private int sinirNot = 75;  

	    public boolean notKiyasla(int kullaniciNotu) {
	        return kullaniciNotu > sinirNot;  
	    }

	    public static void main(String[] args) {
	        Not notKiyasla = new Not();  
	        System.out.println("Lütfen aldığını notu giriniz:");
	        Scanner sc = new Scanner(System.in);
	        int kullaniciNotu= sc.nextInt();
	        boolean sonuc = notKiyasla.notKiyasla(kullaniciNotu);  // Not kıyaslama işlemi yapılır
	        System.out.println("Kullanıcı notu yeterli mi? " + sonuc);  // Sonuç yazdırılır
	    }
	}
