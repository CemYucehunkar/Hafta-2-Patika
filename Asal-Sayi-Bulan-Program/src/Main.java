import java.util.Scanner;

public class Main {

    static boolean asalSayi() {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Bir Sayı Seçiniz : ");
        sayi = scan.nextInt();

        if (sayi <= 1) {
            System.out.println("Asal Sayı Değildir ! ");
        }
        for (int i = 2; i <= sayi; i++) {

            if (sayi % i == 0) {
                System.out.println("Asal Sayı Değildir !");
                break;

            } else
                System.out.println("Asal Sayıdır !");
            break;

        }
        return asalSayi();

    }

    public static void main(String[] args) {

        asalSayi();


    }
}
