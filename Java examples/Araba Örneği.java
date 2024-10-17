*Bir Car ve Main class oluşturun. 
Car sınıfında model, motor gücü, motor hacmi, 
kapı özellikleri, renk, yıl, kilometresi ve 
markası bulunsun. 
Aynı zamanda sınıfa iki farklı metod tanımlayın. Bunları Main classında çağırın. 
Daha sonra özellikleri private 
erişim belirleyicisi ile çağırmayı deneyin.*/

public class Car {
	
	private String model;
	public String renk;
	public  int yil;
	public int kilometre;
	private int kapı; 
	public String marka;
	public  float motorHacmi;
	
	/*public Car() {
		//System.out.println("Kendi yazdığımız constructor");	
		
		//this(model,yil,motorHacmi);
	}*/
	
	public Car (String model, int yil, float motorHacmi) {
		this.model = model;
		this.yil = yil;
		this.motorHacmi =motorHacmi;	
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKapı() {
		return kapı;
	}							
	public void setKapı(int kapı) {
		this.kapı = kapı;
	}
		
}


-------------------- Main Class -------------------
public class Main {

	public static void main(String[] args) {		
		Car myCar = new Car("G-63",2024, (float) 1.6);
		
		System.out.println("Kapı:" + myCar.getKapı());
		System.out.println("Renk:" + myCar.renk);
		System.out.println("Model:"+ myCar.getModel());
		System.out.println("Motor Hacmi:"+ myCar.motorHacmi);
		

	}

}
