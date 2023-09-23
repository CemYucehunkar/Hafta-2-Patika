import java.util.Scanner;

public class Main {
    static int usAlma(int base, int exp) {
        //Üs sıfır olursa 1 verecek
        if (exp == 0) {
            return 1;
        }
        //Üs sıfır veya 1den farklı ise recursivede kendiyle çarpılarak döndürecek
        else {
            int result = usAlma(base, exp - 1);
            return result * base;
        }
    }


    public static void main(String[] args) {
        int base, exp;
        Scanner ınput = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz : ");
        base = ınput.nextInt();
        System.out.print("Üs Değeri Giriniz : ");
        exp = ınput.nextInt();

        System.out.println("Result: " + usAlma(base, exp));

    }
}