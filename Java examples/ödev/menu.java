package kompozisyon;

import java.util.ArrayList;
import java.util.List;

public class menu {
	private List<yemek> yemeklistesi;
	private List<icicek> iceceklistesi;
	
	public menu() {
		yemeklistesi = new ArrayList<>();
		iceceklistesi = new ArrayList<>();
	}
	
	public void yemekEkle(yemek yemek) {
		yemeklistesi.add(yemek);
	}

	public void icecekEkle(icicek icicek) {
		iceceklistesi.add(icicek);
	}
	public void goster() {
		System.out.println("---menü---");
		System.out.println("yemekler");
		for (yemek yemek : yemeklistesi) {
			yemek.yemekBilgisi();
		}
		System.out.println("içicekler:");
		for (icicek icicek: iceceklistesi) {
			icicek.icicekBilgisi();
		}
	}
}
