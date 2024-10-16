public class MukemmelSayi{
 public static void mukemmelSayibul(int num) {
 for (int number = 1; number <= num; number++) {
 int sum = 0;
 
 // Sayının bölenlerini bul
 for (int i = 1; i < number; i++) {
 if (number % i == 0) {
 sum += i;
 }
 }
 // Mükemmel sayı mı?
 if (sum == number) {
 System.out.println(number + " bir mükemmel sayıdır.");
 }
 }
 }
 public static void main(String[] args) {
 mukemmelSayibul(1000); // Çıktı: 6, 28, 496
 }
}