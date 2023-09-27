import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] liste = {1, 2, 3, 4, 5, 6};
        double ortalam = 0.0;
        double sum = 0;
Arrays.sort(liste);
        for (int i = 0; i < liste.length; i++) {

            sum += liste[i];

        }
        System.out.print(" Dizideki Sayıların Harmonik Ortalaması : " + (ortalam += liste.length/sum));
    }
}
