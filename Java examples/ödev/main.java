package kompozisyon;

public class main {
    public static void main(String[] args) {
         menu menu = new menu(); 

        
        menu.yemekEkle(new yemek("Köfte", 50.0)); 
        menu.yemekEkle(new yemek("Pide", 45.0)); 
        menu.icecekEkle(new icicek("Ayran", 10.0));
        menu.icecekEkle(new icicek("Kola", 15.0)); 

      
        menu.goster();

        System.out.println("Program sonlandırılıyor...");
    }
}