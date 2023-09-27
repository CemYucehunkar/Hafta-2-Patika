public class Cokludonguler {
    public static void main(String[] args) {
        int[][] liste = new int[3][4];
        int sayı = 1;
        for (int i = 0; i < liste.length; i++) {

            for (int j = 0; j < liste[i].length; j++) {
                liste[i][j] = sayı++;
                System.out.print(liste[i][j]+ " ");
            }
            System.out.println();
        }

    }
}