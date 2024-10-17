public class Main{
 
 public static void main(String[] args) {
 
 Scanner scan = new Scanner(System.in);
 
 System.out.print("1. Sayiyi giriniz: ");
 int sayi1 = scan.nextInt();
 System.out.print("2. Sayiyi giriniz: ");
 int sayi2 = scan.nextInt();
 
 if(sayi1 > sayi2) {
 System.out.println("Sayi1, sayi2 den büyüktür.");
 }
 else if(sayi1 < sayi2) {
 System.out.println("Sayi1, sayi2 den kücüktür.");
 }
 else {
 System.out.println("Girilen sayilar birbirine esittir.");
 }
 }
}