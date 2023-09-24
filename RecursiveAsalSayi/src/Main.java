import java.util.Scanner;

public class Main {

    // Recursive olarak asal sayı kontrolü
    static boolean asalMi(int num, int divisor) {
        if (num <= 2) {
            return (num == 2);
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        return asalMi(num, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Asal değil");
        } else {
            boolean asal = asalMi(sayi, 2);
            if (asal) {
                System.out.println(sayi + " bir asal sayıdır.");
            } else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }

    }
}
