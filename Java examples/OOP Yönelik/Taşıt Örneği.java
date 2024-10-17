public class Tasit {
	public void ilerle(int birim) {
		System.out.println("Taşıt " + birim + 
				" birim ilerliyor..");
		}
}

*****


public class DenizTasiti extends Tasit {

}

****
public class KaraTasiti extends Tasit {
	private int tekerlekSayisi;
	
	public int getTekerlekSayisi(int tekerlekSayisi) {
		return tekerlekSayisi;
	}

	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
}


****


public class HavaTasiti extends Tasit {

}

******


public class MotorluKaraTasiti extends KaraTasiti {
	private int motorHacmi;
	private String model = "G-63";
	
	
	
	public String getModel() {
		return model;
	}

	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		this.motorHacmi = motorHacmi;
	}

}

*****

public class MotorsuzKaraTasiti extends KaraTasiti{

}

*****


public class Bisiklet extends MotorsuzKaraTasiti{

}

****


public class Otomobil extends MotorluKaraTasiti{

}

******


public class Main {

	public static void main(String[] args) {
		Bisiklet bisiklet = new Bisiklet();
		bisiklet.ilerle(5);
		System.out.print("Bisikletin " + bisiklet.getTekerlekSayisi(2) +
		 " tekerleği var.");
		
		Otomobil oto = new Otomobil();
		oto.ilerle(50);
		System.out.print("Otomobilin " + oto.getTekerlekSayisi(4) +
				 " tekerleği var.");
		oto.setMotorHacmi(1);
		System.out.print("Otomobilin " + oto.getMotorHacmi() +
				 " motor hacmi var.");
		System.out.print("Otomobilin " + oto.getModel() +
				 " model.");
	}

}
