import java.util.Scanner;

public class Main {

    static int Toplama(int a, int b) {
        int result = a + b;
        System.out.print("Toplam :" + result);
        return result;
    }

    static int Cıkartma(int a, int b) {
        int result = a - b;
        System.out.print("Sonuç : " + result);
        return result;
    }

    static int Carpma(int a, int b) {
        int result = a * b;
        System.out.print("Sonuç : " + result);
        return result;
    }

    static int Bölme(int a, int b) {
        if (b == 0) {
            System.out.print("Bir Sıfıra Bölünemez");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }

    static int UssAlma(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) ;
        {
            result *= a;
        }
        System.out.print("Sonuç : "+result);
        return result;

    }

    static int Mod(int a, int b) {
        int result = 1;

        if (b == 0) {
            System.out.println("Bir Sayının Sıfıra Modu : " + a);
            result = a;
        } else
        result = a % b;
        System.out.println("Sonuç : "+result);
        return result;

    }

    static void Dikdörtgen(int a, int b) {

        System.out.println("Alanı : " + (a * b));
        System.out.println("Çevresi : " + (2 * (a + b)));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        System.out.println(" Menü");
        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkartma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üstlü Sayı Hesaplama\n"
                + "6-Mod Alma\n"
                + "7-Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0-Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("1.Sayıyı Giriniz : ");
            int a = scan.nextInt();
            System.out.print("2.Sayıyı Giriniz : ");
            int b = scan.nextInt();

            switch (select) {

                case 1:
                    Toplama(a, b);

                    break;
                case 2:
                    Cıkartma(a, b);
                    break;
                case 3:
                    Carpma(a, b);
                    break;
                case 4:
                    Bölme(a, b);
                    break;
                case 5:
                    UssAlma(a, b);
                    break;

                case 6:
                    Mod(a, b);
                    break;
                case 7:
                    Dikdörtgen(a, b);
                    break;
                default:
                    System.out.println(" Yanlış bir işlem girdiniz!");

            }
            System.out.println();
        }
        System.out.println(" Güle Güle");
    }
}
