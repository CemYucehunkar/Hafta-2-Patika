
public class Main {
    static boolean isPalindrom(int sayi) {
        //Yukarıda boolen ile bu durumun doğruluğunu sorgulamak amaçlandı,

        int temp = sayi, yenisayi = 0, sonSayi;
        //farklı türde değişkenler belirlendi. ve tem=sayi durumu oluşturuldu.
        // sebebi sayi her seferinde farklı bir değer alacağı için
        //sabit olan bir sayıyı bir değişkene dönüştürdük

        while (temp != 0) {
            sonSayi = temp % 10;
            yenisayi = (yenisayi * 10) + sonSayi;
            temp /= 10;
        // her seferinde basamağı  bulup bununla yeni sayı oluşturmak için bir döngü oluşturduk
        }
        if (sayi == yenisayi) {
            // Bu bir palindrom sayı ise diye sorgulamak için oluşturuldu
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(2675));

    }
}