import java.util.Scanner;
public class Ucgen{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Üçgenin kenar uzunluklarını al
 System.out.println("Birinci kenarı giriniz: ");
 int a = scanner.nextInt();
 System.out.println("İkinci kenarı giriniz: ");
 int b = scanner.nextInt();
 System.out.println("Üçüncü kenarı giriniz: ");
 int c = scanner.nextInt();
 // Üçgen olma şartı: Herhangi iki kenarın toplamı üçüncü kenardan büyük olmalıdır
 if (a + b > c && a + c > b && b + c > a) { DIŞTAKİ İF
 // Eşkenar üçgen kontrolü
 if (a == b && b == c) {
 System.out.println("Bu bir eşkenar üçgendir.");
 }
 // İkizkenar üçgen kontrolü
 else if (a == b || b == c || a == c) {
 System.out.println("Bu bir ikizkenar üçgendir.");
 }
 // Çeşitkenar üçgen kontrolü
 else {
 System.out.println("Bu bir çeşitkenar üçgendir.");
 }
 } else {
 System.out.println("Bu kenarlar bir üçgen oluşturmaz.");
 }
 }
}
