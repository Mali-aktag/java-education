    *
   ***
  *****
 *******
*********
- Yukarıdaki kodu çıktıyı basan kodu yazınız. – iç içe for.

public class Main {
 public static void main(String[] args) {
 // Yıldız beşgeni çizdirme
 int n = 5; // Çizilecek üçgenin yüksekliğini alır
 // Üçgenin her satırı basmasını sağlayan ilk for döngüsü
 for (int i = 1; i <= n; i++) {
 // Boşlukları basacak iç for döngüsü
 for (int j = i; j < n; j++) {
 System.out.print(" ");
 }
 // Yıldızları basmak için yazılan for döngüsü 
//(2*i)-1 tek sayı halinde basılmasını sağlamak için yazılır.
 for (int k = 1; k <= (2 * i - 1); k++) {
 System.out.print("*");
 }
 System.out.println(); // Boşluklar ve yıldız basıldıktan sonra alt satıra geçilmesini sağlayan kod
 }
 }
}