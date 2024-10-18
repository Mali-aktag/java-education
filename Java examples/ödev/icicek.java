package kompozisyon;

public class icicek {
	private String isim;
	private double fiyat;
	
	public icicek(String isim, double fiyat) {
		this.isim= isim;
		this.fiyat= fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public void icicekBilgisi() {
		System.out.println("yemek:"+isim+" fiyat:"+fiyat+"TL");
	}
}
