-Girdiğin sayı 0 olana kadar girdi alan bir program yazınız. Do-while.
Scanner scanner = new Scanner(System.in);
 int number;
 do {
 System.out.print("Bir sayı girin (Çıkmak için 0): ");
 number = scanner.nextInt();
 System.out.println("Girdiğiniz sayı: " + number);
 } while (number != 0); // Kullanıcı 0 girene kadar döngü devam eder.
 System.out.println("Program sonlandı.");
 scanner.close(); // Scannerın sonlanmasını sağlamak için yazılır. 