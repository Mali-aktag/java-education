*
***
*****
*******
*********
- Yukarıdaki kodu çıktıyı basan kodu yazınız. – for.
public class Main {
 public static void main(String[] args) {
 int n = 5; // Üçgenin yüksekliği
 for (int i = 1; i <= n; i++) {
 for (int j = 1; j <= i; j++) {
 System.out.print("*");
 }
 System.out.println(); // Her satırdan sonra yeni satıra geç
 }
 }
}