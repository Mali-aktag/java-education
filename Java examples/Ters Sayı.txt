public class TersSayi {
public static void sayınıntersiniAl(int a) {
		int sayac=0;

		while(a!=0) {
			a=a/10;
			sayac++;
		}		
		System.out.println(sayac);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi = sc.nextInt();
		
		sayınıntersiniAl(sayi);

	}

}
